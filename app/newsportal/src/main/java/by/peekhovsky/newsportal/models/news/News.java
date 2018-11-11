package by.peekhovsky.newsportal.models.news;


import by.peekhovsky.newsportal.models.users.User;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author Rostislav Pekhovsky 2018
 * @version 0.1
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "news", schema = "public")
@ToString(exclude = "text")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String text;

    private LocalDate date;

    @OneToOne
    private User user;
}
