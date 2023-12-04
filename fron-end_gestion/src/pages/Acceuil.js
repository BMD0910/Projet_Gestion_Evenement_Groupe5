import React, { useState , useEffect } from "react";
import { Swiper, SwiperSlide } from 'swiper/react';
import Stack from '@mui/material/Stack';
import Button from '@mui/material/Button';
import { Card } from 'react-bootstrap';


import x from "../img/slider1.jpg";
import y from "../img/Slider2.jpg";
import z from "..//img/slider3.jpg";
import w from "../img/slider4.jpg";
import r from "../img/Bas_slider.jpg";
import b from "../img/jules.jpg";
import s from "../img/soda.jpg";
import { Link } from 'react-router-dom';

// Import Swiper styles
import 'swiper/css';





export default function Acceuil() {

  const idUser = sessionStorage.getItem("idUser") ;
  const [compte, setCompte] = useState({
    username : ""+sessionStorage.getItem("username") ,
    password : ""      
   });


    

  useEffect(() => {
    
     
  
    
    const rechercheId =  () =>{
      fetch("http://localhost:8080/api/users/idUser",{
         method: "POST" ,
         headers: {"content-Type" : 'text/plain'},
         body: JSON.stringify(sessionStorage.getItem("username")) ,
          })
         .then(response => {
         
          
            sessionStorage.setItem("idUser", response.headers.get("Authorization"))
            
            //fetchEvennement();
    
          
           
          
        }) 
       .catch(err =>alert(err) ) ;
        
    };
  
   
    rechercheId();
  
  }, []);

  return (
<div className='Essaie'>
      

      <h2 className='text'> Besoin d'architecte d'evenement? <br/>
          faite confiance a Events Planning
      </h2>

      <br/>
      <br/>

  <div>
      <br/>
    <Swiper
      spaceBetween={50}
      slidesPerView={3}
      onSlideChange={() => console.log('slide change')}
      onSwiper={(swiper) => console.log(swiper)}
    >
      <SwiperSlide><img src={x}/></SwiperSlide>
      <SwiperSlide><img src={y}/></SwiperSlide>
      <SwiperSlide><img src={z}/></SwiperSlide>
      <SwiperSlide><img src={w}/></SwiperSlide>
      
    </Swiper>

    
  </div>

      <br/>
      <br/>
      <br/>

      <small className='zboss'>Bienvenue a Event's Planning</small>

      <br/>
      <br/>
      <br/>

      
      
      <small className='zboss1'>Dans le royaume de la création de plateformes d'événements, <br/>
          Nous sommes les architectes de l'inattendu.<br/>
          Chaque ligne de code est un maillon d'une chaîne d'expériences,<br/>
          Chaque événement est une porte ouverte vers l'inconnu.</small>
    
    
      <br/>
      <br/>
      <br/>

      <h3> Voulez vous savoir plus cliquer ici !</h3>
      <br/>
      <br/>
      
      <small className='zboss1'> Tu es Client ou Prestataires?</small>
      <br/>
      <br/>
      <br/>

      <Stack direction="row" spacing={2}>
      <Button variant="contained" color="success" className='zboss'> <Link to="/register">Client</Link></Button>
      <p>ou</p>
      <Button variant="contained" color="success" className='zboss'> <Link to="/register">Prestataires</Link></Button>
      
    
      </Stack>
      <img src={r} alt='pas image' width={500} className='Bas_slider'/>
      <br/>
      <br/>
      <h2 className='souligner'>My Team
        
      </h2>
      <br/>
      <br/>
      <br/>

      <div className='zboss2'>
      <Card style={{width: '18rem' }}>
      <Card.Img style={{ width:'14rem', height:'14rem'}} variant="top" src={b} />
      <Card.Body>
        <Card.Title className='zboss1'>Souleymane Diagne</Card.Title>
        <Card.Text>
          Designer
        </Card.Text>
        
      </Card.Body>
    </Card>

    <Card style={{width: '18rem' }}>
      <Card.Img style={{ width:'14rem', height:'14rem'}} variant="top" src={s} />
      <Card.Body>
        <Card.Title className='zboss1'>Mareme Thiam</Card.Title>
        <Card.Text>
          Big Data
        </Card.Text>
       </Card.Body>
    </Card>

    <Card style={{width: '18rem' }}>
      <Card.Img style={{ width:'14rem', height:'14rem'}} variant="top" src={w} />
      <Card.Body>
        <Card.Title className='zboss1'>Baye Mor Diouf</Card.Title>
        <Card.Text>
          Developpeur Web
        </Card.Text>
       </Card.Body>
    </Card>


    <Card style={{width: '18rem' }}>
      <Card.Img style={{ width:'14rem', height:'14rem'}} variant="top" src={w} />
      <Card.Body>
        <Card.Title className='zboss1'>Alioune Diop </Card.Title>
        <Card.Text>
         Cyber security
        </Card.Text>
       </Card.Body>
    </Card>
    
    
      </div>
      
    
        
    
      
      










  


  <div>















  </div>


</div>
  );
};

