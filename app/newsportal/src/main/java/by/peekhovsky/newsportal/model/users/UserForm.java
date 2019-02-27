package by.peekhovsky.newsportal.model.users;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserForm {
    private String login;
    private String password;
    private String firstName;
    private String lastName;
}
