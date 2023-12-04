package com.groupe5.domaine.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groupe5.domaine.model.Evenement;
import com.groupe5.domaine.model.User;
import com.groupe5.domaine.repository.EvenementRepository;
import com.groupe5.domaine.repository.UserRepository;

@RestController
@RequestMapping("/api/evenement")
public class EvenementController {

    @Autowired
    private UserRepository userRepository; 
     @Autowired
    private EvenementRepository evenementRepository; 

    @PostMapping("/create")
    public ResponseEntity<String> createEvenement(@RequestBody Evenement evenement ) {
        try {
            String email =  evenement.getLien() ;
             Optional<User> user1 = userRepository.findByUsername(email);
            
              User user = user1.get() ;
		     
            Evenement event1 = new Evenement(user, evenement.getNom(), evenement.getType(),evenement.getDescription(), evenement.getDate() , evenement.getHeure(), evenement.getLieu());
            evenementRepository.save(event1) ;
              return new ResponseEntity<>("Evenement créé avec succès", HttpStatus.CREATED);
        } 
        catch (Exception e) {
            return new ResponseEntity<>("Erreur lors de la création de l'utilisateur", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

  
}