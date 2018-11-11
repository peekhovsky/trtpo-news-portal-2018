package by.peekhovsky.newsportal.repositories;

import by.peekhovsky.newsportal.models.news.News;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface NewsRepository extends JpaRepository<News, Long> {
    List<News> findFirst10ByDate(LocalDate localDate);
}

