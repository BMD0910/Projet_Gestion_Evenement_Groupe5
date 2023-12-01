import React, { useState } from 'react';

import x from "../img/Catering-Service-Traiteur-Plateau-Delices.jpg";
import y from "../img/Awards Dinner 19.jpg";
import z from "..//img/Le-Comptoir-Traiteur-88-1024x682.jpg";
import w from "../img/Photo_julien_traiteur_369_9_PPResponsive.jpg";





const PrestataireSearchPage = () => {
  const [searchTerm, setSearchTerm] = useState('');
  const [searchResults, setSearchResults] = useState([]);

  const handleSearch = () => {
    // Ajoutez ici la logique pour effectuer la recherche côté serveur
    // En utilisant une requête API, par exemple avec fetch ou axios

    // Exemple de requête API fictive :
    // fetch(`/api/prestataires?search=${searchTerm}`)
    //   .then(response => response.json())
    //   .then(data => setSearchResults(data));
  };

  return (
    <div className='jules'>
      <h2 className='jules1'>Recherche de Prestataires</h2>
      <input
        type="text"
        placeholder="Rechercher des prestataires..."
        value={searchTerm}
        onChange={(e) => setSearchTerm(e.target.value)}
      />
      <button onClick={handleSearch}>Rechercher</button>

      {/* Affichage des résultats de la recherche */}
      {searchResults.map((prestataire) => (
        <div key={prestataire.id}>
          <h3>{prestataire.nom}</h3>
          <p>{prestataire.description}</p>
          {/* Ajoutez d'autres détails du prestataire ici */}
        </div>
      ))}
      <br/>
      <br/>
      <br/>

      <div className='images'>
       
        <img src={x} height={120}/>
      </div>
      <br/>
      <br/>
      
      
      

      
      <div className='images1'>
        <img src={y} height={120}/>
      </div>
      <br/>
      <br/>
      
        
      <div className='images2'> 
        <img src={z} height={120}/>
      </div>
      <br/>
      <br/>
      

      <div className='images3'>
        <img src={w} height={120}/>
      </div>

      



    </div>
  );
};

export default PrestataireSearchPage;
