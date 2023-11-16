package com.groupe5.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.groupe5.Service.JwtService;
import com.groupe5.domaine.AccountCredentials;

/*
    La classe du contrôleur pour la connexion. La connexion
    se fait en appelant l'endpoint /login en utilisant la méthode POST et en envoyant le nom
    d'utilisateur et le mot de passe dans le corps de la requête.
 */
@RestController
public class LoginController {
    @Autowired
    private JwtService jwtService;

    @Autowired 
    private AuthenticationManager authenticationManager; //  Injecté AuthenticationManager

    @PostMapping("/login")
    public ResponseEntity<?> getToken(@RequestBody AccountCredentials credentials){
        UsernamePasswordAuthenticationToken creds = new UsernamePasswordAuthenticationToken(credentials.getUsername(), credentials.getPassword()); 
        
        Authentication auth = authenticationManager.authenticate(creds);
        String jwts = jwtService.getToken(auth.getName()); // Generer le jeton pour le user
        
        return ResponseEntity.ok()
            .header(HttpHeaders.AUTHORIZATION, "Bearer" + jwts)
            .header(HttpHeaders.ACCESS_CONTROL_EXPOSE_HEADERS, "Authorization").build();
    } 
}