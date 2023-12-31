package com.groupe5.domaine.controller;




import com.groupe5.domaine.model.AccountCredentials;
import com.groupe5.domaine.model.Service;
import com.groupe5.domaine.model.User;
import com.groupe5.domaine.repository.UserRepository;

import java.util.Optional;

import org.hibernate.mapping.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository; // Suppose you have a UserRepository interface

    @PostMapping("/create")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        try {
              User user1 = new User(user.getUsername(),user.getPassword(),user.getRole(),user.getNom(), user.getPrenom()) ;
              userRepository.save(user1);

              return new ResponseEntity<>("Utilisateur créé avec succès", HttpStatus.CREATED);
        } 
        catch (Exception e) {
            return new ResponseEntity<>("Erreur lors de la création de l'utilisateur", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

   @PostMapping("/idUser")
    public ResponseEntity<?> recherccheIdUser(@RequestBody String username) {
        Optional<User> user1 = userRepository.findByUsername(username);        
        User user = user1.get() ;
        int id= user.getIdUser() ;
        	return ResponseEntity.ok()
				.header(HttpHeaders.AUTHORIZATION,""+ id)
				.header(HttpHeaders.ACCESS_CONTROL_EXPOSE_HEADERS, "Authorization")
				.build();

        //return userRepository.findIdByUsername(username); 
    }


   /* * @PostMapping("/create")
    public ResponseEntity<String> recherccheIdUser(@RequestBody User user) {
        try {
              User user1 = new User(user.getUsername(),user.getPassword(),user.getRole(),user.getNom(), user.getPrenom()) ;
              userRepository.save(user1);

              return new ResponseEntity<>("Utilisateur créé avec succès", HttpStatus.CREATED);
        } 
        catch (Exception e) {
            return new ResponseEntity<>("Erreur lors de la création de l'utilisateur", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
   */ 
}

