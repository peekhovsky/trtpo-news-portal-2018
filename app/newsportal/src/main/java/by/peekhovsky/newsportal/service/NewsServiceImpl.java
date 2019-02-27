package by.peekhovsky.newsportal.service;

import by.peekhovsky.newsportal.model.news.News;
import by.peekhovsky.newsportal.model.news.NewsForm;
import by.peekhovsky.newsportal.model.users.User;
import by.peekhovsky.newsportal.repository.NewsRepository;
import by.peekhovsky.newsportal.repository.UserRepository;
import by.peekhovsky.newsportal.transfer.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class NewsServiceImpl implements NewsService {

    private final NewsRepository newsRepository;

    private final UserRepository userRepository;

    private int totalPagesSearch = 0;
    @Autowired
    public NewsServiceImpl(final NewsRepository newsRepository,
                           final UserRepository userRepository) {
        this.newsRepository = newsRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<News> findAllByPage(final long pageNumber) {
       Pageable pageable = new PageRequest((int) pageNumber, 10);
       Page<News> page = newsRepository.findAllByDateTimeBeforeOrderByDateTimeDesc(LocalDateTime.now(), pageable);
       return page.getContent();
    }



    @Override
    public boolean save(NewsForm newsForm, UserDto userDto) {
        Optional<User> userOptional
                = userRepository.findOneByLogin(userDto.getLogin());
        if (userOptional.isPresent()) {
            News news = News.builder()
                    .title(newsForm.getTitle())
                    .description(newsForm.getDescription())
                    .text(newsForm.getText())
                    .author(userOptional.get())
                    .dateTime(LocalDateTime.now()).build();
            newsRepository.save(news);
            return true;
        }
        return false;
    }

    @Override
    public Optional<News> findById(final Long id) {
       return newsRepository.findFirstById(id);
    }

    @Override
    public List<News> findAllByTitle(String title, final long pageNumber) {
        Pageable pageable = new PageRequest((int) pageNumber, 10);
        Page<News> page = newsRepository
                .findAllByTitleIsContainingIgnoreCase(title, pageable);
        totalPagesSearch = page.getTotalPages();
        return page.getContent();
    }

    @Override
    public int pageCount() {
        return  (int) newsRepository.count() / 10;
    }

    @Override
    public int pageCountSearch() {
        return  totalPagesSearch;
    }

    @Override
    public void deleteById(long id) {
        newsRepository.delete(id);
    }

}
