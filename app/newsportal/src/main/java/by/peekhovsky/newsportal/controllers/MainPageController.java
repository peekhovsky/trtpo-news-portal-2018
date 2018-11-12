package by.peekhovsky.newsportal.controllers;

import by.peekhovsky.newsportal.models.news.News;
import by.peekhovsky.newsportal.users.NewsService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class MainPageController {

    private static final int DEFAULT_PAGE_NUMBER = 0;

    private final NewsService newsService;

    private static final Logger LOGGER
            = LogManager.getLogger(MainPageController.class);

    @Autowired
    public MainPageController(NewsService newsService) {
        this.newsService = newsService;
    }



    @GetMapping("/{page-num}")
    public String getMainPage(ModelMap model,
                              @PathVariable(value = "page-num") long pageNumber) {
        List<News> news = newsService.findAllByPage(pageNumber);
        LOGGER.debug("Get main page, news: " + news);
        model.addAttribute("newsFromServer", news);
        return "main";
    }
    @GetMapping("/")
    public String getMainPage(ModelMap model) {

        List<News> news = newsService.findAllByPage(DEFAULT_PAGE_NUMBER);
        LOGGER.debug("Get main page, news: " + news);
        model.addAttribute("newsFromServer", news);
        return "main";
    }

    @GetMapping("/news/{news-id}")
    public String getNews(ModelMap model,
                              @PathVariable(value = "news-id") long newsId) {
        Optional<News> optionalNews = newsService.findById(newsId);
        if (optionalNews.isPresent()) {
            model.addAttribute("news", optionalNews.get());
            return "news";
        } else {
            return "error404";
        }

    }

    @PostMapping("/")
    public String signIn() {
        return "main";
    }
}
