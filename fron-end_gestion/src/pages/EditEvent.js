
import React, { useState } from 'react';




function EditEvent() {
  const [eventData, setEventData] = useState({
    eventName: '',
    eventDate: '',
    eventTime: '',
    eventLocation: '',
    eventDescription: '',
    eventType: '',
  });
  const handleInputChange = (e) => {
    const { name, value } = e.target;
    setEventData({ ...eventData, [name]: value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    // Ajoutez ici la logique pour envoyer les données au back-end
  };




  return (
    <div className="auth">
      <h1>Modifier un événement</h1>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          name="eventName"
          placeholder="Nom de l'événement"
          value={eventData.eventName}
          onChange={handleInputChange}
        />
        <input
          type="date"
          name="eventDate"
          placeholder="Date de l'événement"
          value={eventData.eventDate}
          onChange={handleInputChange}
        />
        <input
          type="time"
          name="eventTime"
          placeholder="Heure de l'événement"
          value={eventData.eventTime}
          onChange={handleInputChange}
        />
        <input
          type="text"
          name="eventLocation"
          placeholder="Lieu de l'événement"
          value={eventData.eventLocation}
          onChange={handleInputChange}
        />
        <textarea
          name="eventDescription"
          placeholder="Description de l'événement"
          value={eventData.eventDescription}
          onChange={handleInputChange}
        />
        <select
          name="eventType"
          value={eventData.eventType}
          onChange={handleInputChange}
        >
          <option value="">Sélectionnez le type d'événement</option>
          <option value="Fête d'anniversaire">Fête d'anniversaire</option>
          <option value="Mariage">Mariage</option>
          <option value="Conférence">Conférence</option>
          <option value="Concert">Concert</option>
          <option value="Atelier">Atelier</option>
          {/* Ajoutez d'autres types d'événements au besoin*/}
       </select>
        <button type="submit">Modifier</button>
      </form>
      
    </div>
  );
  };

export default EditEvent;
