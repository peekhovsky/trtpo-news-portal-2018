package by.peekhovsky.newsportal.dao;

import by.peekhovsky.newsportal.models.News;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Component
@SuppressWarnings("WeakerAccess")
public class UsersDaoJdbcTemplateImpl implements NewsDao {

    private JdbcTemplate template;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private Map<Long, News> usersMap = new HashMap<>();

    //language=SQL
    private final static String SQL_SELECT_ALL_BY_TITLE =
            "SELECT * FROM public.news WHERE title = ?";
    //language=SQL
    private final static String SQL_SELECT_ALL =
            "SELECT * FROM public.news";
    //language=SQL
    private final static String SQL_SELECT_BY_ID =
            "SELECT * FROM public.news WHERE id = :id";
    //language=SQL
    private final static String SQL_INSERT_USER =
            "INSERT INTO news(title, text) VALUES (:title, :text)";

    private UsersDaoJdbcTemplateImpl() {
    }

    @Autowired
    public UsersDaoJdbcTemplateImpl(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
        this.namedParameterJdbcTemplate
                = new NamedParameterJdbcTemplate(dataSource);
    }

    private RowMapper<News> newsRowMapper =
            ((resultSet, i) -> News.builder()
                    .id(resultSet.getLong("id"))
                    .title(resultSet.getString("title"))
                    .text(resultSet.getString("text"))
                    .build()
            );

    @Override
    public List<News> findAllByTitle(String title) {
        return template.query(SQL_SELECT_ALL_BY_TITLE, newsRowMapper, title);
    }

    @Override
    public Optional<News> find(Long id) {
        Map<String, Object> params = new HashMap<>();
        params.put("id", id);
        List<News> result = namedParameterJdbcTemplate
                .query(SQL_SELECT_BY_ID, params, newsRowMapper);
        if (result.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(result.get(0));
    }

    @Override
    public List<News> findAll() {
        List<News> result = template.query(SQL_SELECT_ALL, newsRowMapper);
        usersMap.clear();
        return result;
    }

    @Override
    public void save(News model) {
        Map<String, Object> params = new HashMap<>();
        params.put("title", model.getTitle());
        params.put("text", model.getText());
        namedParameterJdbcTemplate.update(SQL_INSERT_USER, params);
    }

    @Override
    public void update(News model) {

    }

    @Override
    public void delete(Long id) {

    }
}