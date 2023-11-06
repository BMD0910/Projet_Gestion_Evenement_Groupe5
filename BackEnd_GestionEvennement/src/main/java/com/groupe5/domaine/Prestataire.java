package com.groupe5.domaine;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Prestataire {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(nullable=false)
    private long idPrestataire ;
    
    @Column(nullable=false)
    private String nom ;

    @Column(nullable=false)
    private String description ;

/*Utilisation de OneToMany pour effectuer la jointure de Evenement et Prestataire */
    @OneToMany(mappedBy = "idPrestataire")
    @JoinColumn(name = "idEvenement", nullable = false)
    private List<Evenement> evenements;

    /*Utilisation de ManyToMany pour effectuer la jointure de Service et Prestataire */
    @ManyToMany 
    @JoinTable(name = "ServiceOfferts",joinColumns = @JoinColumn(name = "idPrestataire"), 
                inverseJoinColumns = @JoinColumn(name = "idService")
                )
    private List<Service> services = new ArrayList<>();
    
    
   /* --------------les Constructeurs--------------- */
    public Prestataire() {}

    public Prestataire(String nom, String description, List<Service> services) {
        this.nom = nom;
        this.description = description;
        this.services = services;
    }


    /* --------------les getters et les setters--------------- */

    
   
    public long getIdPrestataire() {
        return idPrestataire;
    }

    public void setIdPrestataire(long idPrestataire) {
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

    public List<Evenement> getPrestataire() {
        return this.evenements;
    }

    public void setPrestataire(List<Evenement> evenements) {
        this.evenements = evenements;
    }

}
