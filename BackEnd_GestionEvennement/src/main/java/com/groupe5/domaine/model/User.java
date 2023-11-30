package com.groupe5.domaine.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity 
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable=false, nullable=false)
    private int idUser;

    @Column(nullable=false, unique = true)
    private String username;

    @Column(nullable=false)
    private String password;

    @Column(nullable=false)
    private String role;

    @Column(nullable=true)
	private String nom;
     
    @Column(nullable=true)
    private String prenom ;

    @Autowired
    private transient BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();


   /*Utilsation de OneToMany pour joindre les classes Utilisateur et Evenement */
   @OneToMany(targetEntity = Evenement.class, mappedBy = "user",cascade = CascadeType.ALL)
   //@JoinColumn(name = "evenements")
   private List<Evenement> evenements = new ArrayList<>();

    public User(String username, String password, String role, String nom, String prenom) {
        this.username = username;
        this.password = passwordEncoder.encode(password) ;
        this.role = role;
        this.nom = nom;
        this.prenom = prenom;
    }

    public User(){} 

    public User(String username, String password, String role ){
        this.username = username;
        this.password = password;
        this.role = role;
    }


 /* les getters et setters */   

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return username;
    }

    public void setNameUser(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleUser() {
        return role;
    }

    public void setRoleUser(String role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<Evenement> getEvenements() {
        return evenements;
    }

    public void setEvenements(List<Evenement> evenements) {
        this.evenements = evenements;
    }

    
}
