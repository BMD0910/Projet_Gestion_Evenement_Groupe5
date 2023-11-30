package com.groupe5.domaine.repository;

import com.groupe5.domaine.model.Evenement;

import org.springframework.data.repository.CrudRepository;

public interface EvenementRepository extends CrudRepository<Evenement, Integer>{
    
}
