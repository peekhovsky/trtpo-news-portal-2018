package by.peekhovsky.newsportal.controller;

import by.peekhovsky.newsportal.security.details.UserDetailsImpl;
import by.peekhovsky.newsportal.service.NewsService;
import by.peekhovsky.newsportal.transfer.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import static by.peekhovsky.newsportal.transfer.UserDto.from;

@Controller
public class DeleteNewsController {

    private final NewsService newsService;

    @Autowired
    public DeleteNewsController(NewsService newsService) {
        this.newsService = newsService;
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

    @GetMapping("/delete/{news-id}")
    public String addNews(@PathVariable(value = "news-id") long newsId) {
        newsService.deleteById(newsId);
        return "redirect:/";
    }
}
