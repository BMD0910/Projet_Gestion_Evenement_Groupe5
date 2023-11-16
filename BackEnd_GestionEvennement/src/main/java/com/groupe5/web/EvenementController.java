package com.groupe5.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groupe5.domaine.Evenement;
import com.groupe5.domaine.EvenementRepository;

@RestController
public class EvenementController {
    @Autowired
    private EvenementRepository evenementRepository;
    
    @RequestMapping("/evenements")
    public Iterable<Evenement> getEvenements(){
        return evenementRepository.findAll();
    }
}
