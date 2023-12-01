
import React, { useState } from 'react';




function Formulaire() {

  
  
  const [event1, setEvent] = useState({
     
    /* user : getCurrentUser() ,*/
     lien : sessionStorage.getItem('username'),
     nom: '',
     type: '',
     description: '',
     date: '',
     heure: '',
     lieu: ''
   });
   
   
   
   
   //permet d'enregistrer les modifications faites sur les champs du fomulaire 
   const handleChange = event => {
        
    setEvent({ ...event1, [event.target.name ] : event.target.value });
    
 };


 const addEvent = event1 =>{
  fetch("http://localhost:8080/api/evenement/create",{
      method: "POST" ,
      headers: {"content-Type" : "application/json"},
      body: JSON.stringify(event1) ,
      })
      .then(response => {
         if (response.ok) {
          alert("evenement creer") ;
         }
         else {
          alert("Quelque chose c'est mal passe !") ;
         }
         
       }) 
      .catch(err => alert(err)) ;
      alert("ca passe");
 };


/*****************************************/ 

   const  handleSave = () =>{       
    addEvent(event1) ; 
         
};


/*****************************************/ 




  return (
    <div className="auth">
      <h1>Creer un événement</h1>
      <form onSubmit={handleSave}>
        <input
          required
          type="text"
          name="nom"
          placeholder="Nom de l'événement"
          value={event1.nom}
          onChange={handleChange}
        />
        <input
          required
          type="date"
          name="date"
          placeholder="Date de l'événement"
          value={event1.date}
          onChange={handleChange}
        />
        <input
          required
          type="time"
          name="heure"
          placeholder="Heure de l'événement"
          value={event1.heure}
          onChange={handleChange}
        />
        <input
          required
          type="text"
          name="lieu"
          placeholder="Lieu de l'événement"
          value={event1.lieu}
          onChange={handleChange}
        />
        <textarea
          required
          name="description"
          placeholder="Description de l'événement"
          value={event1.description}
          onChange={handleChange}
        />
        <select
          required
          name="type"
          value={event1.type}
          onChange={handleChange}
        >
          <option value="">Sélectionnez le type d'événement</option>
          <option value="Fête d'anniversaire">Fête d'anniversaire</option>
          <option value="Mariage">Mariage</option>
          <option value="Conférence">Conférence</option>
          <option value="Concert">Concert</option>
          <option value="Atelier">Atelier</option>
          {/* Ajoutez d'autres types d'événements au besoin*/}
       </select>
        <button type="submit">Créer l'événement</button>
      </form>
      
    </div>
  );
  };

export default Formulaire;
