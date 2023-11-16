package com.groupe5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.groupe5.domaine.Evenement;
import com.groupe5.domaine.EvenementRepository;
import com.groupe5.domaine.Prestataire;
import com.groupe5.domaine.PrestataireRepository;
import com.groupe5.domaine.Service;
import com.groupe5.domaine.ServiceRepository;
import com.groupe5.domaine.Utilisateur;
import com.groupe5.domaine.UtilisateurRepository;

import java.util.Arrays;
@SpringBootApplication
public class GestionEvenement implements CommandLineRunner {

	@Autowired
	private UtilisateurRepository userRepository;
	
	@Autowired
	private EvenementRepository evenementRepository;

	@Autowired
	private PrestataireRepository prestataireRepository;

	@Autowired
	private ServiceRepository serviceRepository;

	public static void main(String[] args) {
		SpringApplication.run(GestionEvenement.class, args);
	}
   
	@Override

	public void run(String... args) throws Exception {
	//Creation des utilisateurs et leurs informations
		Utilisateur user1 = new Utilisateur("Diop", "aliou", "passaliou", "Ingenieur", "aliou@");
		Utilisateur user2 = new Utilisateur("Ndiaye", "Modou", "passmodou", "Traiteur", "moudou@");
		Utilisateur user3 = new Utilisateur("Fall", "Issa", "passissa", "Animatrice", "issa@");
		Utilisateur user4 = new Utilisateur("Sall", "Moussa", "passmoussa", "Organisateur", "moussa@");
		Utilisateur user5 = new Utilisateur("Diop", "Hamat", "passhamat", "Ingenieur", "hamat@");

		userRepository.saveAll(Arrays.asList(user1, user2, user3, user4, user5));

		// Creation des Services
		Service service1 = new Service("Dinee Et Soire", "Tout ce qui est dinnee et soire!");
		Service service2 = new Service("Soire Et Divers", "Dans de ceremonie de retrouvaille!");
		Service service3 = new Service("Fete Et indivialite", "des petit et moyens evenement aniversaire etc!");
		Service service4 = new Service("Mainteance Informatique", "reglaage de probleme du domaine informatique!");
		Service service5 = new Service("Cyber Securite", "La securite des systeme Informatise!");
		Service service6 = new Service("Agence Des Prestataire", "Agence complet pour assurer les evenements!");
		Service service7 = new Service("Developeme Agency", "Du domaine de developpemt des logiciels audio visuel etc..!");

		serviceRepository.saveAll(Arrays.asList(service1, service2, service3, service4,   service5, service6, service7));

	// Creation des Prestataire et leur informations 
		Prestataire prestataire1 = new Prestataire("InfoTech", "Gestion des systeme d'infromation!");
		Prestataire prestataire2 = new Prestataire("EvenementGarant", "Organisation de different evenement!");
		Prestataire prestataire3 = new Prestataire("TraiteEvent", "traiteur de tout les evenements!");
		Prestataire prestataire4 = new Prestataire("VisuelAudio", "Gestion de l'image et l'audio visuel!");
		Prestataire prestataire5 = new Prestataire("KhelComTech", "Du domaine informatique!");
		   
		   //Ajout de service pour chaque prestatire
			prestataire1.ajouService(service1) ;
			prestataire2.ajouService(service2) ;
			prestataire3.ajouService(service3) ;
			prestataire4.ajouService(service4) ;
			


		prestataireRepository.saveAll(Arrays.asList(prestataire1, prestataire2, prestataire3,prestataire4, prestataire5));

	//Creation des Evenements et leur liasion pour chaque utilsateur
		String date1 = "2021-09-01";
		
		Evenement event1 = new Evenement(user1, "Journee de Conde", "Informatique", "Coder des logiciels et test d'intrusion!","2021-03-02", "Privee");
		Evenement event2 = new Evenement(user3, "Dinee de Charite", "Soire", "Soire De ceremonie pour les employees!",date1, "Sorano");
		Evenement event3 = new Evenement(user2, "Dinee", "Soire", "Soire pour se sentir!",date1, "Palais d'or");
		Evenement event4 = new Evenement(user4, "Mariage", "Cremonie de Famille", "Mariage, liaison par consentement!",date1, "Medina Fall THIES");
		Evenement event5 = new Evenement(user5, "Journee de Conde", "Informatique", "Coder des logiciels et test d'intrusion!",date1, "Privee");
		Evenement event6 = new Evenement(user1, "Journee de Conde", "Informatique", "Coder des logiciels et test d'intrusion!",date1, "Privee");
         
			//Ajout de Prestataires pour les evenements 
			event1.ajoutPrestataire(prestataire1) ;
			event1.ajoutPrestataire(prestataire2) ;
			event1.ajoutPrestataire(prestataire3) ;

		evenementRepository.saveAll(Arrays.asList(event1, event2, event3, event4, event5,event6));

	
		
	}
}
        
