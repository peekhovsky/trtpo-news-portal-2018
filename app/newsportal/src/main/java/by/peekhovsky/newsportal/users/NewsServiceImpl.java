package by.peekhovsky.newsportal.users;

import by.peekhovsky.newsportal.models.news.News;
import by.peekhovsky.newsportal.repositories.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    private final NewsRepository newsRepository;

   @Autowired
    public NewsServiceImpl(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @Override
    public List<News> findFirst10ByDate() {
        LocalDate localDate = LocalDate.now();
        return newsRepository.findFirst10ByDate(localDate);
    }

    public List<News> findAll() {
        return newsRepository.findAll();
    }
}
