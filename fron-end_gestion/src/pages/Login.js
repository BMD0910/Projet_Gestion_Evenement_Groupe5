import axios from "axios";
import React, { useEffect, useState } from "react";
import { useContext } from "react";
import { Link, useNavigate } from "react-router-dom";
//import { AuthContext } from "../context/authContext";
import { stepperClasses } from "@mui/material";
import { wait } from "@testing-library/user-event/dist/utils";
import {jwtDecode} from "jwt-decode"

const Login = () => {
  const navigate = useNavigate();
  sessionStorage.setItem("idUser", null);

 
  
/***************************************************************************/  


  const [compte, setCompte] = useState({
    username : "" ,
    password : ""      
   });

  sessionStorage.setItem("jwt", null) ;
  sessionStorage.setItem("username", null) ;

/***************************************************************************/  
  const [err, setError] = useState("");

  

/***************************************************************************/  

  const handleChange = event => {
        
    setCompte({ ...compte, [event.target.name ] : event.target.value });
    
 };


/***************************************************************************/ 

/*
  const connexion =  (compte) =>{
     fetch("http://localhost:8080/login",{
        method: "POST" ,
        headers: {"content-Type" : "application/json"},
        body: JSON.stringify(compte) ,
        })
        .then(response => {
           const jwtToken = response.headers.get("Authorization");
           if (jwtToken != null) {
              sessionStorage.setItem("jwt", jwtToken) ;
              sessionStorage.setItem("username", compte.username) ;
              navigate("/events")
            }
            else
            {
              alert("Username ou mot de passe incorrect !") ;
            }
           
         }) 
        .catch(err =>alert(err) ) ;
       
 };

 const handleSubmit = async (e) => {
    
    e.preventDefault();
    try {
      connexion(compte) ;
    } catch (err) {
      setError("Username ou mot de passe incorrect !");
    } 
  };


 */



 

  const handleSubmit = async (e) => {
    
    e.preventDefault();
    try {
      fetch("http://localhost:8080/login",{
     method: "POST" ,
     headers: {"content-Type" : "application/json"},
     body: JSON.stringify(compte) ,
     })
     .then(response => {
        const jwtToken = response.headers.get("Authorization");
        if (jwtToken != null) {
           sessionStorage.setItem("jwt", jwtToken) ;
           sessionStorage.setItem("username", compte.username) ;
           navigate("/")
         }
         else
         {
          setError("Username ou mot de passe incorrect !"); 
         }
        
      }) 
     .catch(err => setError("Une probleme de connexion est survenue veiller resseyer !")) ;
    }
    catch (err) {
      setError("Username ou mot de passe incorrect !");
    } 
  };

/***************************************************************************/ 

  
  return (
    <div className="auth">
      <h1>Login</h1>
      <form onSubmit={handleSubmit}>
        <input
          required
          type="text"
          placeholder="username"
          name="username"
          value={compte.username}
          onChange={handleChange}
        />
        <input
          required
          type="password"
          placeholder="password"
          name="password"
          value={compte.password}
          onChange={handleChange}
        />
        <button type="submit">Login</button>
        {err && <p>{err}</p>}
        <span>
          Don't you have an account? <Link to="/register">Register</Link>
        </span>
      </form>
    </div>
  );
};

export default Login;
