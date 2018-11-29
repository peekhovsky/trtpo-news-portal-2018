package by.peekhovsky.newsportal.services;

import by.peekhovsky.newsportal.models.news.News;
import by.peekhovsky.newsportal.models.news.NewsForm;
import by.peekhovsky.newsportal.transfer.UserDto;

import java.util.List;
import java.util.Optional;

public interface NewsService {
    Optional<News> findById(Long id);
    List<News> findAllByPage(long pageNumber);
    List<News> findAllByTitle(String title, long pageNumber);
    boolean save(NewsForm newsForm, UserDto userDto);
    int pageCount();
    int pageCountSearch();
    void deleteById(long id);
}
