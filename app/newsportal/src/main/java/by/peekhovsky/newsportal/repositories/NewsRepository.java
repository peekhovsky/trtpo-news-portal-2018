package by.peekhovsky.newsportal.repositories;

import by.peekhovsky.newsportal.models.news.News;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NewsRepository extends JpaRepository<News, Long> {
    Optional<News> findFirstById(Long id);
}

