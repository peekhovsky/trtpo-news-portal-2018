package by.peekhovsky.newsportal.services;

import by.peekhovsky.newsportal.repositories.UsersRepository;
import by.peekhovsky.newsportal.security.details.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UsersRepository usersRepository;

    @Autowired
    public UserDetailsServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String login) {
        return new UserDetailsImpl(
                usersRepository.findOneByLogin(login)
                        .orElseThrow(()
                                -> new UsernameNotFoundException(
                                "User is not found."))
        );
    }
}
