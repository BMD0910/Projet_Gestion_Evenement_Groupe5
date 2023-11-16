package com.groupe5.Service;

import java.security.Key;
import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.http.HttpServletRequest;

@Component
public class JwtService {
    
    static final long EXPIRATIONTIME = 86400; // 1 days ms // Définit le temps d'expiration du jeton en millisecondes (ms)
    static final String PREFIX = "Bearer ";      // Définit le préfixe du jeton
    static final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256); // Clé secrète est créée à l'aide de la méthode secretKeyFor()

// La méthode getToken génère et retourne le token
    public String getToken(String username){
        
        String token = Jwts.builder()
            .setSubject(username)
            .setExpiration(new Date(System.currentTimeMillis() + EXPIRATIONTIME))
            .signWith(key)
            .compact();

        return token;
    }

//La méthode getAuthUser obtient le jeton de l'en-tête Authorization de la réponse de getToken()
    public String getUserH(HttpServletRequest request){
        String token = request.getHeader(HttpHeaders.AUTHORIZATION);
        if (token != null) {
            String user = Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token.replace(PREFIX, ""))
                .getBody()
                .getSubject();

            if (user != null) 
                return user;
        }
        return null;
    }
}
