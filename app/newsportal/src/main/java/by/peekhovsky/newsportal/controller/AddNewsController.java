package by.peekhovsky.newsportal.controller;

import by.peekhovsky.newsportal.model.news.NewsForm;
import by.peekhovsky.newsportal.security.details.UserDetailsImpl;
import by.peekhovsky.newsportal.service.NewsService;
import by.peekhovsky.newsportal.transfer.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import static by.peekhovsky.newsportal.transfer.UserDto.from;

@Controller
public class AddNewsController {

    private final NewsService newsService;

    private UserDto userDto;

    @Autowired
    public AddNewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @ModelAttribute
    public void checkAuthentication(Authentication authentication, ModelMap model) {
        if (authentication != null) {
            UserDetailsImpl details
                    = (UserDetailsImpl) authentication.getPrincipal();
            userDto = from(details.getUser());
            model.addAttribute("userDto", userDto);
        }
    }

    @GetMapping("/add_news")
    public String getMainPage() {
        return "add_news";
    }

    @PostMapping("/add_news")
    public String addNews(NewsForm newsForm) {
        newsService.save(newsForm, userDto);
        return "redirect:/";
    }
}
