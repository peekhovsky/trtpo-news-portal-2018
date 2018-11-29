package by.peekhovsky.newsportal.repositories;

import by.peekhovsky.newsportal.models.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


/**
 * @author Rostislav Pekhovsky 2018
 * @version 0.1
 * */
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findOneByLogin(String login);
}
