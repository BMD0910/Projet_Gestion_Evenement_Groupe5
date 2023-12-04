import React, { useState , useEffect } from "react";
import x from "../img/MSTG.jpg";
import Card from 'react-bootstrap/Card';
import Button from 'react-bootstrap/Button';
import { Link ,useNavigate} from 'react-router-dom';
import EditEvent from './EditEvent';






export default function Events()  {
  const [evenement , setEvenement] = useState([]) ;
  
 const username = sessionStorage.getItem("username") ;
 const navigate = useNavigate();
  
 const tempsAttente = 0;

    
 //const idUser = sessionStorage.getItem("idUser")  
 const idUser = 6;
  
 
    useEffect(() => {
   
    const fetchEvennement = () =>{
      fetch("http://localhost:8080/api/evenements")
      .then(response => response.json())
      .then(data => setEvenement(data._embedded.evenements))
      .then(err => console.error(err)) ;
      
       
    };
    fetchEvennement();


    
  
  }, []);    
       

 
 



 /*useEffect(() => {
    
  const rechercheId =  () =>{
    fetch("http://localhost:8080/api/users/idUser",{
       method: "POST" ,
       headers: {"content-Type" : "application/json"},
       body: JSON.stringify(username) ,
       })
       .then(response => {
       
        if (idUser != null) {
          sessionStorage.setItem("idUser", response.headers.get("Authorization"))
          
          //fetchEvennement();
  
        }
         
        
      }) 
     .catch(err =>alert(err) ) ;
      
  };

 
  rechercheId();

}, []);
*/


  



 
  


  return (
    
    <div className='events'>
   /*
        <button className='btn'>
        <Link to="/Mes_Events">Mes_Events</Link><span class="MuiTouchRipple-root css-8je8zh-MuiTouchRipple-root"></span>
        </button>
        &nbsp;&nbsp;

        <button className='btn'>
          
        <svg stroke="currentColor" fill="currentColor" stroke-width="0" viewBox="0 0 448 512" height="1em" width="1em" xmlns="http://www.w3.org/2000/svg"><path d="M416 208H272V64c0-17.67-14.33-32-32-32h-32c-17.67 0-32 14.33-32 32v144H32c-17.67 0-32 14.33-32 32v32c0 17.67 14.33 32 32 32h144v144c0 17.67 14.33 32 32 32h32c17.67 0 32-14.33 32-32V304h144c17.67 0 32-14.33 32-32v-32c0-17.67-14.33-32-32-32z"></path></svg><Link to="/Formulaire"> Creer_events</Link><span class="MuiTouchRipple-root css-8je8zh-MuiTouchRipple-root"></span>
        </button>

        <h2 className='text'> Mes Differents types d'evenement</h2>
      
        <br/>
        

        <div className='EVENTS'>
        {
          
          evenement.map((evenement, index) =>

          <Card style={{ width: '18rem' }}>
          <Card.Img variant="top" src={x}/>
            <Card.Body>
              <Card.Title><h2>{evenement.type}</h2></Card.Title>
              <Card.Text>
              
                <small>Nom : {evenement.nom}</small><br/>
                <small>Heure :{evenement.heure}</small><br/>
                
                <small>Date : {evenement.date}</small><br/>
                <small>Lieu:{evenement.lieu}</small><br/>

              </Card.Text>
              
              <Button variant="primary">Modifier</Button>
              <Button variant="primary">Supprimer</Button>
            
          </Card.Body>
           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
           
        </Card>
        
          )
      }
        </div>
    </div>








    
  )


  
}














