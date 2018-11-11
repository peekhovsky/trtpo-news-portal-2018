package by.peekhovsky.newsportal.controllers;

import by.peekhovsky.newsportal.models.News;
import by.peekhovsky.newsportal.repositories.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UsersWithJpaController {

    private final NewsRepository newsRepository;

    @Autowired
    public UsersWithJpaController(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @GetMapping(value = "/jpa/news")
    public ModelAndView getUsers(@RequestParam(value = "name", required = false) String req) {
        List<News> news = newsRepository.findAll();
        ModelAndView modelAndView = new ModelAndView("news");
        modelAndView.addObject("newsFromServer", news);
        return modelAndView;
    }
}
