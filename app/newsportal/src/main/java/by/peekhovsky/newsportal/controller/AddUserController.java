package by.peekhovsky.newsportal.controller;

import by.peekhovsky.newsportal.model.users.User;
import by.peekhovsky.newsportal.model.users.UserForm;
import by.peekhovsky.newsportal.model.users.UserState;
import by.peekhovsky.newsportal.model.users.UserValidator;
import by.peekhovsky.newsportal.repository.UserRepository;
import by.peekhovsky.newsportal.security.details.UserDetailsImpl;
import by.peekhovsky.newsportal.security.password.Password;
import by.peekhovsky.newsportal.transfer.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static by.peekhovsky.newsportal.transfer.UserDto.from;

@Controller
public class AddUserController {

    private final UserRepository userRepository;

    @Autowired
    public AddUserController(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    @ModelAttribute
    public void checkAuthentication(Authentication authentication, ModelMap model) {
        if (authentication != null) {
            UserDetailsImpl details
                    = (UserDetailsImpl) authentication.getPrincipal();
            UserDto userDto = from(details.getUser());
            model.addAttribute("userDto", userDto);
        }
    }

    @GetMapping("/add_user")
    public String getAddUser(ModelMap modelMap, @RequestParam(required = false)
            String message) {
        if (message != null && !message.isEmpty()) {
            modelMap.addAttribute("message", message);
        }
        return "add_user";
    }

    @PostMapping("/add_user")
    public String addUser(ModelMap model, UserForm userForm) {
        Password password = new Password();

        if (userRepository.findOneByLogin(userForm.getLogin()).isPresent()) {
            String message = "Login is not available. Please, choose another";
            return "redirect:/add_user?message=" + message;
        }
        if (!UserValidator.isValid(userForm)) {
            String message = "Data is not valid! Please, fill all fields";
            return "redirect:/add_user?message=" + message;
        }
        User user = User.builder().userState(UserState.ACTIVE)
                .firstName(userForm.getFirstName())
                .lastName(userForm.getLastName())
                .login(userForm.getLogin())
                .hashPassword(password.passwordEncoder().encode(userForm.getPassword()))
                .build();
        userRepository.save(user);
        return "redirect:/";
    }
}
