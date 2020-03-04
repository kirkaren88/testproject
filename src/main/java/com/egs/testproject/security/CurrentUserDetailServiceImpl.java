package com.egs.testproject.security;

import com.egs.testproject.model.persistence.User;
import com.egs.testproject.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class CurrentUserDetailServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    public CurrentUserDetailServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(s);
        if (user == null){
            throw new UsernameNotFoundException("Username nor found");
        }
        return new CurrentUser(user);
    }
}
