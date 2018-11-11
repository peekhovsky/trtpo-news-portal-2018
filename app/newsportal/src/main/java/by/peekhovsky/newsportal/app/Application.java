package by.peekhovsky.newsportal.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Application start point.
 *
 * @author Rostislav Pekhovsky 2018
 * @version 0.1
 */

@SpringBootApplication
@ComponentScan(basePackages = "by.peekhovsky.newsportal")
@EnableJpaRepositories(basePackages = "by.peekhovsky.newsportal.repositories")
@EntityScan(basePackages = "by.peekhovsky.models")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
