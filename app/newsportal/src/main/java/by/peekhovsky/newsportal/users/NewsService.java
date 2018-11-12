package by.peekhovsky.newsportal.users;

import by.peekhovsky.newsportal.models.news.News;

import java.util.List;
import java.util.Optional;

public interface NewsService {
    Optional<News> findById(Long id);
    List<News> findAllByPage(long pageNumber);
}
