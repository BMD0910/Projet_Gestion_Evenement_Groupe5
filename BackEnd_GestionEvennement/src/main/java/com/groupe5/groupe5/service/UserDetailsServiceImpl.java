package com.groupe5.service;

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
    
    /*  Injecter la classe UserRepository dans la classe UserDetailsServiceImpl car cela est
    nécessaire pour récupérer l'utilisateur depuis la base de données lorsque Spring Security gère
    l'authentification. */
    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> users = userRepository.findByUsername( username );
        //la classe UserBuilder de Spring Security pour construire l'utilisateur pour l'authentification.
        UserBuilder builder = null; 
        if (users.isPresent()) {/* Utiliser la méthode isPresent() pour vérifier si l'utilisateur existe. */
            User currentUser = users.get();
            builder = org.springframework.security.core.userdetails.User.withUsername(username);
            builder.password(currentUser.getPassword());
            builder.roles(currentUser.getRoleUser());

        } else 
            throw new UsernameNotFoundException("Nom d'utilisateur non trouve !");
        return builder.build();
    }

}
