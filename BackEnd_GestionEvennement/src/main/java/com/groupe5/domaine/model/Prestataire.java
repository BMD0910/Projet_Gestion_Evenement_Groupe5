package com.groupe5.domaine.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;


@Entity
public class Prestataire {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "idPrestataire",nullable=false)
    private int idPrestataire ;
    
    @Column(nullable=false)
    private String nom ;

    @Column(nullable=false)
    private String description ;

// Utilisation de OneToMany pour effectuer la jointure de Evenement et Prestataire
    @ManyToMany(targetEntity = Evenement.class) 
    @JoinTable(name = "EvensPrestataire",joinColumns = @JoinColumn(name = "idPrestataire"), 
    inverseJoinColumns = @JoinColumn(name = "idEvenement"))
    private List<Evenement> evenements;

// Utilisation de ManyToMany pour effectuer la jointure de Service et Prestataire 
    @ManyToMany(targetEntity = Service.class)
    @JoinTable(name = "ServiceOfferts",joinColumns = @JoinColumn(name = "idPrestataire"), 
                inverseJoinColumns = @JoinColumn(name = "idService")
                )
    private List<Service> services = new ArrayList<>();

   /* --------------les Constructeurs--------------- */
    public Prestataire() {}

    public Prestataire(String nom, String description) {
        super();
        this.nom = nom;
        this.description = description;
    }


    /* --------------les getters et les setters--------------- */

    
   
    public int getIdPrestataire() {
        return idPrestataire;
    }

    public void setIdPrestataire(int idPrestataire) {
        this.idPrestataire = idPrestataire;
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

    public  void ajouService(Service service ){
       this.services.add(service) ;
      
    }

    public List<Evenement> getEvenements() {
        return evenements;
    }

    public void setEvenements(List<Evenement> evenements) {
        this.evenements = evenements;
    }
    
     public  void ajouEvenement(Evenement evenement ){
       this.evenements.add(evenement) ;
      
    }

}