package by.peekhovsky.newsportal.model.users;

public final class UserValidator {
    public static boolean isValid(UserForm userForm) {
        return !userForm.getFirstName().isEmpty()
                && !userForm.getLastName().isEmpty()
                && !userForm.getLogin().isEmpty()
                && !userForm.getPassword().isEmpty();
    }
}
