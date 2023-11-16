/*package com.groupe5.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.stereotype.Service;

import com.groupe5.domaine.User;
import com.groupe5.domaine.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    
    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> users = userRepository.findByNameUser( username );

        UserBuilder builder = null;
        if (users.isPresent()) {
            User currentUser = users.get();
            builder = org.springframework.security.core.userdetails.User.withUsername(username);
            builder.password(currentUser.getPassword());
            builder.roles(currentUser.getRoleUser());

        } else {
            throw new UsernameNotFoundException("Nom d'utilisateur non trouve !");
        }
        return builder.build();
    }

} 
 */