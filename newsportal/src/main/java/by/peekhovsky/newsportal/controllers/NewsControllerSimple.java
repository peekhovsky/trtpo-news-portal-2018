package by.peekhovsky.newsportal.controllers;

import by.peekhovsky.newsportal.dao.NewsDao;
import by.peekhovsky.newsportal.models.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


public class NewsController implements Controller {

    @Autowired
    private NewsDao newsDao;

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest,
                                      HttpServletResponse httpServletResponse)
            throws Exception {
        System.out.println("handle request!");
        if (httpServletRequest.getMethod().equals("GET")) {
            List<News> news = newsDao.findAll();
            System.out.println(news);
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("news");
            modelAndView.addObject("newsFromServer", news);
            return modelAndView;
        }

        return null;
    }
}
