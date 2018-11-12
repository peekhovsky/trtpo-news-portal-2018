package by.peekhovsky.newsportal.repositories;

import by.peekhovsky.newsportal.models.news.News;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface NewsRepository extends JpaRepository<News, Long> {
    Optional<News> findFirstById(Long id);
}

