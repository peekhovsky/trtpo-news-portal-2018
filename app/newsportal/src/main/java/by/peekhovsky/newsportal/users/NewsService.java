package by.peekhovsky.newsportal.users;

import by.peekhovsky.newsportal.models.news.News;

import java.util.List;

public interface NewsService {
    List<News> findFirst10ByDate();
    List<News> findAll();
}
