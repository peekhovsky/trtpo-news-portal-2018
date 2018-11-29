package by.peekhovsky.newsportal.services;

import by.peekhovsky.newsportal.repositories.UserRepository;
import by.peekhovsky.newsportal.security.details.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    @Autowired
    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String login) {
        return new UserDetailsImpl(
                userRepository.findOneByLogin(login)
                        .orElseThrow(()
                                -> new UsernameNotFoundException(
                                "User is not found."))
        );
    }
}
