package com.groupe5.domaine.model;

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

@Entity
public class Service {
    
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false)
	private Long idService;

    @Column(nullable=false, unique=true)
	private String nom;

    @Column(nullable = true)
    private String description;
    /*Utilisation de ManyToMany pour effectuer la jointure de Service et Prestataire */
    @ManyToMany(targetEntity = Prestataire.class)
    @JoinTable(name = "ServiceOfferts",joinColumns = @JoinColumn(name = "idService"), 
                inverseJoinColumns = @JoinColumn(name = "idPrestataire"))
    private List<Prestataire> prestataires = new ArrayList<>();

     /* --------------les Constructeurs--------------- */
    public Service() {}

    public Service(String nom, String description) {
        super();
        this.nom = nom;
        this.description = description;
    }

    /* --------------les getters et les setters--------------- */

    public Long getId() {
        return idService;
    }

    public void setId(Long idService) {
        this.idService = idService;
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
    public List<Prestataire>  getPrestataires() {
        return prestataires;
    }
    public void setPrestataires(List<Prestataire>  prestataires) {
        this.prestataires = prestataires;
    }
     
}
