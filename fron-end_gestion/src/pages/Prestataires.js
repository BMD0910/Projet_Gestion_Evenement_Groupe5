import React, { useState } from 'react';

import x from "../img/animateur.png";
import y from "../img/fleuriste.png";
import z from "../img/Photo_julien_traiteur_369_9_PPResponsive.jpg";

import Card from 'react-bootstrap/Card';





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
      <div className='events'>

      
      <br/>
    

      <div className='EVENTS'>
      <Card style={{ width: '18rem' }}>
      <Card.Img variant="top" src={z}/>
      <Card.Body>
        <Card.Title>Baye Mor Diouf</Card.Title>
        <Card.Text>
         
         <small>Traiteur</small><br/>
         
        </Card.Text>
        
      
        
      
      </Card.Body>
      </Card>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

      <Card style={{ width: '18rem' }}>
      <Card.Img variant="top" src={x}/>
      <Card.Body>
        <Card.Title>Alioune Diop</Card.Title>
        <Card.Text>
        <small>Animateur</small><br/>
        

        </Card.Text>
     
        

      </Card.Body>
      </Card>

      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

      <Card style={{ width: '18rem' }}>
      <Card.Img variant="top" src={y}/>
      <Card.Body>
      <Card.Title>Mareme Thiam</Card.Title>
      <Card.Text>
          <small>Fleuriste</small><br/>
       
  </Card.Text>

  

</Card.Body>
</Card>

          




      </div>
      </div>
   

       


    </div>
  );
};

export default PrestataireSearchPage;
