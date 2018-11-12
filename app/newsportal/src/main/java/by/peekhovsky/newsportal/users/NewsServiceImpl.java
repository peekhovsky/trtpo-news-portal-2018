package by.peekhovsky.newsportal.users;

import by.peekhovsky.newsportal.models.news.News;
import by.peekhovsky.newsportal.repositories.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class NewsServiceImpl implements NewsService {

    private final NewsRepository newsRepository;

    @Autowired
    public NewsServiceImpl(final NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @Override
    public List<News> findAllByPage(final long pageNumber) {
       Pageable pageable = new PageRequest((int) pageNumber, 10);
       Page<News> page = newsRepository.findAll(pageable);
       return page.getContent();
    }

    @Override
    public Optional<News> findById(final Long id) {
       return newsRepository.findFirstById(id);
    }

}
