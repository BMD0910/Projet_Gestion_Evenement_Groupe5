package com.groupe5.domaine;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Prestataire {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(nullable=false, updatable=false)
    /*'attribut updatable de l'annotation @Column permet de contrôler si une colonne donnée doit être incluse dans les opérations de mise à jour */
    private long id ;
    
    @Column(nullable=false)
    private String nom ;

    private String description ;
    
    @Column(nullable=false)
    private List<Service> services ;

    private List<Evennement> evennements ;

    
   /* --------------les Constructeurs--------------- */


    public Prestataire(String nom, String description, List<Service> services, List<Evennement> evennements) {
        this.nom = nom;
        this.description = description;
        this.services = services;
        this.evennements = evennements;
    }

    public Prestataire() {}

    /* --------------les getters et les setters--------------- */

    
   
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public List<Evennement> getEvennements() {
        return evennements;
    }

    public void setEvennements(List<Evennement> evennements) {
        this.evennements = evennements;
    }
}
