package by.peekhovsky.newsportal.repositories;

import by.peekhovsky.newsportal.models.news.News;
import by.peekhovsky.newsportal.models.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
}
