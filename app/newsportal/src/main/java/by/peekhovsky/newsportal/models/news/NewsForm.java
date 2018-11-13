package by.peekhovsky.newsportal.models.news;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NewsForm {
    private String title;
    private String description;
    private String text;
}
