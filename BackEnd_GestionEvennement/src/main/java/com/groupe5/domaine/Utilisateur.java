package com.groupe5.domaine;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;


@Entity
public class Utilisateur {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false, updatable=false)
	private Long id;
    /*'attribut updatable de l'annotation @Column permet de contrôler si une colonne donnée doit être incluse dans les opérations de mise à jour */

    
	@Column(nullable=false)
	private String nom;
     
    @Column(nullable=false)
    private String prenom ;
	 
    @Column(nullable=false)
	private String password;

	@Column(nullable=false)
	private String role;
    
    @Column(nullable=false)
    private String email;

    /* --------------les Constructeurs--------------- */

    public Utilisateur(String nom, String prenom, String password, String role, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.password = password;
        this.role = role;
        this.email = email;
    }/*l'attribut id sera generer automatiquemnent donc il n'est pas necessaire de l'introduire dans la constructeur */

    public Utilisateur() {}

    /* --------------les getters et les setters--------------- */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getnom() {
        return nom;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
