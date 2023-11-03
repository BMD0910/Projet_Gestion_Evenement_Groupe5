package com.groupe5.domaine;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.List;

@Entity 
public class Evennement {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(nullable=false, updatable=false)
    private long id ;
    /*'attribut updatable de l'annotation @Column permet de contrôler si une colonne donnée doit être incluse dans les opérations de mise à jour */

    
    @Column(nullable=false)
    private String nom ;

    @Column(name="`type`" , nullable=false)
    private String type ;

    private String description ;

    @Column(name="`date`" , nullable=false)
    private Date date ;
    
    @Column(nullable=false)
    private String lieu ;

    private List<Prestataire> prestataires ;
    private List<Participant> participants ;



   /* --------------les Constructeurs--------------- */

    public Evennement(String nom, String type, String description, Date date, String lieu,
            List<Prestataire> prestataires, List<Participant> participants) 
    {
        this.nom = nom;
        this.type = type;
        this.description = description;
        this.date = date;
        this.lieu = lieu;
        this.prestataires = prestataires;
        this.participants = participants;
    }

    public Evennement() {}


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
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getLieu() {
        return lieu;
    }
    public void setLieu(String lieu) {
        this.lieu = lieu;
    }
    public List<Prestataire>  getPrestataires() {
        return prestataires;
    }
    public void setPrestataires(List<Prestataire>  prestataires) {
        this.prestataires = prestataires;
    }
    public List<Participant> getParticipants() {
        return participants;
    }
    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

   
}
