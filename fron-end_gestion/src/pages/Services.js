import React from 'react'
import { Card } from 'react-bootstrap'
import b from "../img/traiteur.png";
import s from "../img/transport.png";
import z from "..//img/photographe.png";
import w from "../img/maquillage.png";
import u from "../img/securite.png";
import t from "../img/son.png";
import r from "../img/fleuriste.png";
import p from "../img/decoration.png";










export default function Services() {
  return (
    <div className='services_jules'>
      <div className='zboss2'>
        
      <Card style={{width: '18rem' }}>
      <Card.Img style={{ width:'5rem', height:'5rem'}} variant="top" src={b} />
      <Card.Body>
        <Card.Title className='zboss1'>Traiteur</Card.Title>
        <Card.Text>
          
        </Card.Text>
        
      </Card.Body>
    </Card>

    <Card style={{width: '18rem' }}>
      <Card.Img style={{ width:'5rem', height:'5rem'}} variant="top" src={s} />
      <Card.Body>
        <Card.Title className='zboss1'>Transport</Card.Title>
        <Card.Text>
          
        </Card.Text>
       </Card.Body>
    </Card>

    <Card style={{width: '18rem' }}>
      <Card.Img style={{ width:'5rem', height:'5rem'}} variant="top" src={w} />
      <Card.Body>
        <Card.Title className='zboss1'>Maquillage</Card.Title>
        <Card.Text>
          
        </Card.Text>
       </Card.Body>
    </Card>


    <Card style={{width: '18rem' }}>
      <Card.Img style={{ width:'5rem', height:'5rem'}} variant="top" src={z} />
      <Card.Body>
        <Card.Title className='zboss1'>Photograph </Card.Title>
        <Card.Text>
         
        </Card.Text>
       </Card.Body>
    </Card>
    
    
      </div>

      <div className='zboss2'>
      <Card style={{width: '18rem' }}>
      <Card.Img style={{ width:'5rem', height:'5rem'}} variant="top" src={u} />
      <Card.Body>
        <Card.Title className='zboss1'>Securite</Card.Title>
        <Card.Text>
          
        </Card.Text>
        
      </Card.Body>
    </Card>

    <Card style={{width: '18rem' }}>
      <Card.Img style={{ width:'5rem', height:'5rem'}} variant="top" src={t} />
      <Card.Body>
        <Card.Title className='zboss1'>Animateur</Card.Title>
        <Card.Text>
         
        </Card.Text>
       </Card.Body>
    </Card>

    <Card style={{width: '18rem' }}>
      <Card.Img style={{ width:'5rem', height:'5rem'}} variant="top" src={r} />
      <Card.Body>
        <Card.Title className='zboss1'>Fleuriste</Card.Title>
        <Card.Text>
         
        </Card.Text>
       </Card.Body>
    </Card>


    <Card style={{width: '18rem' }}>
      <Card.Img style={{ width:'5rem', height:'5rem'}} variant="top" src={p} />
      <Card.Body>
        <Card.Title className='zboss1'>Decoration </Card.Title>
        <Card.Text>
        
        </Card.Text>
       </Card.Body>
    </Card>

      </div>

    </div>
  )
}















