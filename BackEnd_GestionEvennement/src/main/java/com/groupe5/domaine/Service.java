package com.groupe5.domaine;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Service {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false, updatable=false)
	private Long id;
    /*'attribut updatable de l'annotation @Column permet de contrôler si une colonne donnée doit être incluse dans les opérations de mise à jour */


    @Column(nullable=false, unique=true)
	private String nom;

    private String description ;


     /* --------------les Constructeurs--------------- */


    public Service(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }

    public Service() {}


    /* --------------les getters et les setters--------------- */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

}
