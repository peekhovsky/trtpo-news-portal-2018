package by.peekhovsky.newsportal.services;

import by.peekhovsky.newsportal.models.news.News;
import by.peekhovsky.newsportal.models.news.NewsForm;
import by.peekhovsky.newsportal.models.users.User;
import by.peekhovsky.newsportal.repositories.NewsRepository;
import by.peekhovsky.newsportal.repositories.UsersRepository;
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

    private final UsersRepository usersRepository;

    @Autowired
    public NewsServiceImpl(final NewsRepository newsRepository,
                           final UsersRepository usersRepository) {
        this.newsRepository = newsRepository;
        this.usersRepository = usersRepository;
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
                = usersRepository.findOneByLogin(userDto.getLogin());
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

}
