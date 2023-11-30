package com.groupe5.domaine.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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
    private String heure ;
    
    @Column(nullable=false)
    private String lieu ;

     @Column(nullable=true)
    private String lien ;



/*La Notation ManyToOne permet de joindre des Evenement a un user */
   // @ManyToOne /*(fetch = FetchType.LAZY)*/
   // @JoinColumn(name = "utilisateur")
   //  private Utilisateur utilisateur  ;

/*La Notation ManyToOne permet de joindre des Evenement a un user */
    @ManyToOne /*(fetch = FetchType.LAZY)*/
    
    @JoinColumn(name = "user" ,nullable=true)
     private User user  ;     

    //private Utilisateur utilisateur;

/*Utilisation de ManyToOne pour effectuer la jointure de Evenement et Prestataire */
    @ManyToMany(targetEntity = Prestataire.class) 
    @JoinTable(name = "EvensPrestataire",joinColumns = @JoinColumn(name = "idEvenement"), 
    inverseJoinColumns = @JoinColumn(name = "idPrestataire"))
    private List<Prestataire> prestataire = new ArrayList<>();



    public Evenement(User user, String nom, String type, String description, String date, String heure, String lieu) {
        this.user = user;
        this.nom = nom;
        this.type = type;
        this.description = description;
        this.date = date;
        this.heure = heure;
        this.lieu = lieu;
        
    }

    /* --------------les Constructeurs--------------- */
    public Evenement() {}

    public Evenement(String lien ,String nom, String type, String description, String date, String lieu, String heure) 
    {
        super();
        //this.utilisateur = utilisateur;
        //this.user = user;
        this.lien = lien;
        this.nom = nom;
        this.type = type;
        this.description = description;
        this.date = date;
        this.lieu = lieu;
        this.heure = heure;
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

    public void setUtilisateur(User user) {
        this.user = user;
    }

    public User getUtilisateur() {
        return this.user;
    }

    public List<Prestataire> getPrestataires() {
        return prestataire;
    }

    public void setPrestataires(List<Prestataire> prestataire) {
        this.prestataire = prestataire;
    }
    
    public  void ajoutPrestataire(Prestataire prestataire ){
        this.prestataire.add(prestataire) ;
       
     }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getLien() {
        return lien;
    }

    public User getUser() {
        return user;
    }

    public List<Prestataire> getPrestataire() {
        return prestataire;
    }

    


     
}