package by.peekhovsky.newsportal.dao.news;

import by.peekhovsky.newsportal.dao.CrudDao;
import by.peekhovsky.newsportal.models.News;

import java.util.List;

public interface NewsDao extends CrudDao<News> {
    List<News> findAllByTitle(String title);
}
