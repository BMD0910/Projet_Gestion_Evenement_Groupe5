package com.groupe5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.groupe5.service.UserDetailsServiceImpl;

@Configuration
public class SecurityConfig {
    @Autowired
    private UserDetailsServiceImpl userDetailsServiceImpl;

    /* Nous devons spécifier que Spring Security doit utiliser les utilisateurs de la base de données 
    plutôt que des utilisateurs en mémoire. Ajoutez une nouvelle méthode configureGlobal pour activer
    les utilisateurs depuis la base de données. */
    @Autowired
    public void ConfigureGlobal(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(userDetailsServiceImpl).passwordEncoder(new BCryptPasswordEncoder());
    }
}
