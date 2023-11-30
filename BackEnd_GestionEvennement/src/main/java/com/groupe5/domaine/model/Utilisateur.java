package com.groupe5.domaine.model;
/*package com.groupe5.domaine;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Entity;

@Entity
public class Utilisateur {

    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false)
	private int idUtilisateur;
    
	@Column(nullable=true)
	private String nom;
     
    @Column(nullable=true)
    private String prenom ;
	 
    @Column(nullable=true)
	private String password;

	@Column(nullable=true)
	private String role;
    
    @Column(nullable=true)
    private String email;
*/

/*
    Utilsation de OneToMany pour joindre les classes Utilisateur et Evenement 
*/
   //@OneToMany(targetEntity = Evenement.class, mappedBy = "utilisateur",cascade = CascadeType.ALL)
   //@JoinColumn(name = "evenements")
   //private List<Evenement> evenements = new ArrayList<>();

  /* --------------les Constructeurs--------------- */
  //  public Utilisateur() {}

/*
    l'attribut id sera generer automatiquemnent donc il n'est pas necessaire de l'introduire dans la constructeur
*/


/*  public Utilisateur(String nom, String prenom, String password, String role, String email) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.password = password;
        this.role = role;
        this.email = email;
    }
*/

    /* --------------les getters et les setters--------------- */

/* 
    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(int idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
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

       public List<Evenement> getEvenements() {
    return evenements;
    }

    public void setEvenements(List<Evenement> evenements) {
        this.evenements = evenements;
    }
  
}

*/