package by.peekhovsky.newsportal.controllers;

import by.peekhovsky.newsportal.models.news.News;
import by.peekhovsky.newsportal.users.NewsService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainPageController {

    private final NewsService newsService;

    private static final Logger LOGGER
            = LogManager.getLogger(MainPageController.class);

    @Autowired
    public MainPageController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/")
    public String getMainPage(ModelMap model) {
        List<News> news = newsService.findAll();
        LOGGER.debug("Get main page, news: " + news);
        model.addAttribute("newsFromServer", news);
        return "main";
    }
}
