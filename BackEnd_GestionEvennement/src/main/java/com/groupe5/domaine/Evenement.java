package com.groupe5.domaine;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity 
public class Evenement {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "idEvenement", nullable=false)
    private int idEvenement;

    @Column(nullable=false)
    private String nom ;

    @Column(nullable=false)
    private String type ;

    private String description;

    @Column(nullable=false)
    private String date ;
    
    @Column(nullable=false)
    private String lieu ;

/*La Notation ManyToOne permet de joindre des Evenement a un user */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "utilisateur")
    private Utilisateur utilisateur;

/*Utilisation de ManyToOne pour effectuer la jointure de Evenement et Prestataire */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "prestataire")
    private Prestataire prestataire;


    /* --------------les Constructeurs--------------- */
    public Evenement() {}

    public Evenement(Utilisateur utilisateur, Prestataire prestataire, String nom, String type, String description, String date, String lieu) 
    {
        this.utilisateur = utilisateur;
        this.prestataire = prestataire;
        this.nom = nom;
        this.type = type;
        this.description = description;
        this.date = date;
        this.lieu = lieu;
    }



    /* --------------les getters et les setters--------------- */


    public int getIdEvenement() {
        return idEvenement;
    }

    public void setIdEvenement(int idEvenement) {
        this.idEvenement = idEvenement;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
   
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Utilisateur getUtilisateur() {
        return this.utilisateur;
    }

    public Prestataire getPrestataires() {
        return prestataire;
    }

    public void setPrestataires(Prestataire prestataire) {
        this.prestataire = prestataire;
    }

     
}
