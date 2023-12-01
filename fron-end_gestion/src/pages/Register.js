import React from "react";
import { useState } from "react";
import { Link, useNavigate } from "react-router-dom";
import axios from "axios";

const Register = () => {
 /* const [inputs, setInputs] = useState({
    username: "",
    email: "",
    password: "",
  });*/

  const [user, setUser] = useState({
    username : "" ,
    password : "",
    role : "" ,
    nom : "" ,
    prenom : "" 
  });


  /***************************************************************************/ 


  const [err, setError] = useState(null);
  const navigate = useNavigate();

 /***************************************************************************/ 


  const handleChange = event => {
        
       setUser({ ...user, [event.target.name ] : event.target.value });
       
    };

 /***************************************************************************/ 

    const  handleSave = () =>{    
      addUser(user) ;          
    };

 /***************************************************************************/ 
  
  /*
  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      await axios.post("/auth/register", inputs);
      navigate("/login");
    } catch (err) {
      setError(err.response.data);
    }
  };*/

  const addUser = user =>{
    fetch("http://localhost:8080/api/users/create",{
        method: "POST" ,
        headers: {"content-Type" : "application/json"},
        body: JSON.stringify(user) ,
        })
        .then(response => {
           if (response.ok) {
            alert("user creer") ;
           }
           else {
            
            alert("Cette email est deja utiliser  !") ;
           }
           
         }) 
        .catch(err => alert(err)) ;
        alert("s")
        
};

 /***************************************************************************/ 


  return (
    <div className="auth">
      <h1>Creation de Compte</h1>
      <form onSubmit={handleSave}>
        <input
          required
          type="text"
          placeholder="Nom"
          name="nom"
          value={user.nom}
          onChange={handleChange}
        />
        <input
          required
          type="text"
          placeholder="Prenom"
          name="prenom"
          value={user.prenom}
          onChange={handleChange}  
        />
        <input
          required
          type="text"
          placeholder="Role"
          name="role"
          value={user.role}
          onChange={handleChange}
        />
        <input
          required
          type="email"
          placeholder="email"
          name="username"
          onChange={handleChange}
          value={user.username}
        />
        <input
          required
          type="password"
          placeholder="password"
          name="password"
          onChange={handleChange}
          value={user.password}
        />
        <button>Inscrir</button>
        {err && <p>{err}</p>}
        <span>
          Do you have an account? <Link to="/login">Login</Link>
        </span>
      </form>
    </div>
  );
};

export default Register;
