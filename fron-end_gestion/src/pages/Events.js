import React from 'react'
import x from "../img/MSTG.jpg";
import Card from 'react-bootstrap/Card';
import Button from 'react-bootstrap/Button';
import { Link } from 'react-router-dom';
import EditEvent from './EditEvent';






export default function Events() {
  return (
    <div className='events'>

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
      <Card style={{ width: '18rem' }}>
      <Card.Img variant="top" src={x}/>
      <Card.Body>
        <Card.Title><h2>Mariage</h2></Card.Title>
        <Card.Text>
         
         <small>Nom : Mariage</small><br/>
         <small>Type :familiale</small><br/>
         <small>Description</small><br/>
         <small>📆Date : 14/04/00</small><br/>
         <small>📍Lieu:</small><br/>

        </Card.Text>
        
        <Button variant="primary">Modifier</Button>
        <Button variant="primary">Supprimer</Button>
      
      </Card.Body>
      </Card>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

      <Card style={{ width: '18rem' }}>
      <Card.Img variant="top" src={x}/>
      <Card.Body>
        <Card.Title>Card Title</Card.Title>
        <Card.Text>
        <small>Nom : Mariage</small><br/>
         <small>Type :familiale</small><br/>
         <small>Description</small><br/>
         <small>📆Date : 14/04/00</small><br/>
         <small>📍Lieu:</small><br/>

        </Card.Text>
        <Button variant="primary">Modifier</Button>
        <Button variant="primary">Supprimer</Button>

      </Card.Body>
      </Card>

      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<Card style={{ width: '18rem' }}>
<Card.Img variant="top" src={x}/>
<Card.Body>
  <Card.Title>Card Title</Card.Title>
  <Card.Text>
          <small>Nom : Mariage</small><br/>
         <small>Type :familiale</small><br/>
         <small>Description</small><br/>
         <small>📆Date : 14/04/00</small><br/>
         <small>📍Lieu:</small><br/>

  </Card.Text>
  <Button variant="primary"><Link to="/EditEvent">EditEvent</Link></Button>
  <Button variant="primary">Supprimer</Button>

</Card.Body>
</Card>



      </div>
        
    
    
    
    
    
    
    
    
    </div>









    
  )
}




//📆
//🕒 
//📍

