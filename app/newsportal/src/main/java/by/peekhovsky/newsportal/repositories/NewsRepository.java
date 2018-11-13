package by.peekhovsky.newsportal.repositories;

import by.peekhovsky.newsportal.models.news.News;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.Optional;

public interface NewsRepository extends JpaRepository<News, Long> {
    Optional<News> findFirstById(Long id);
    Page<News> findAllByDateTimeBeforeOrderByDateTimeDesc(LocalDateTime dateTime, Pageable pageable);
}

