import React , {useState} from 'react'
import x from "../img/concert.jpg";
import y from "../img/istockphoto-1327751216-612x612.jpg";
import z from "..//img/mk_pr_shot_belfast_wide_copie.jpg";
import w from "../img/33796_800x480.jpg";
import { Link } from 'react-router-dom';
import Formulaire from './Formulaire';





export default function Events() {

  const [evenement , setEvenement] = useState([]) ;

  /*const fetchEvennement = () =>{
        
    fetch('api/evenements')
     .then(response => response.json())
     .then(data => setCars(data._embedded.evenements))
     .then(err => console.error(err)) ;
  };
*/

  return (
    <div className='events'>
        <button className='btn'>
          <svg stroke="currentColor" fill="currentColor" stroke-width="0" viewBox="0 0 448 512" height="1em" width="1em" xmlns="http://www.w3.org/2000/svg">
            <path d="M416 208H272V64c0-17.67-14.33-32-32-32h-32c-17.67 0-32 14.33-32 32v144H32c-17.67 0-32 14.33-32 32v32c0 17.67 14.33 32 32 32h144v144c0 17.67 14.33 32 32 32h32c17.67 0 32-14.33 32-32V304h144c17.67 0 32-14.33 32-32v-32c0-17.67-14.33-32-32-32z"></path>
          </svg>
          <Link to="/Formulaire">Creer Events</Link>
          <span class="MuiTouchRipple-root css-8je8zh-MuiTouchRipple-root"></span>
        </button>

        <h2 className='text'> La liste de mes Evenements</h2>
        
        <br/>
        
        <div className='image1'>
          <img src={x} height={300}/>
          <p>Réservez vos places dès maintenant et faites partie de cet événement incontournable. Partagez l'excitation avec vos amis et assurez-vous de vivre un moment magique.
              Restez à l'écoute pour plus d'annonces et de surprises ! 🌟 #ConcertÉpique #MusiqueLive #Incontournable<br/>
              📆 Date : [Date du Concert]
              🕖 Heure : [Heure du Concert]
              📍 Lieu : [Nom de la Salle/Endroit]
          </p>
        </div>

        <div className='image1'>
          <img src={x} height={300}/>
          <p>Réservez vos places dès maintenant et faites partie de cet événement incontournable. Partagez l'excitation avec vos amis et assurez-vous de vivre un moment magique.
              Restez à l'écoute pour plus d'annonces et de surprises ! 🌟 #ConcertÉpique #MusiqueLive #Incontournable<br/>
              📆 Date : [Date du Concert]
              🕖 Heure : [Heure du Concert]
              📍 Lieu : [Nom de la Salle/Endroit]
          </p>
        </div>


    </div>









    
  )
}
