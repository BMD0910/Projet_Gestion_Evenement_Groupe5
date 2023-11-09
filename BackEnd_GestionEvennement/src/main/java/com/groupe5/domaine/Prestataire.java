package com.groupe5.domaine;

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
import jakarta.persistence.OneToMany;

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
    @OneToMany(targetEntity = Evenement.class, mappedBy = "prestataire")
    @Column(nullable = false)
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

    public List<Evenement> getEvenement() {
        return this.evenements;
    }

    public void setEvenement(List<Evenement> evenements) {
        this.evenements = evenements;
    }

}
