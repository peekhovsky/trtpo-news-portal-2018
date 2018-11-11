package by.peekhovsky.newsportal.models.news;

import by.peekhovsky.newsportal.models.users.User;
import lombok.*;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
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
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String text;
    @Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
    private LocalDate date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author")
    private User author;
}
