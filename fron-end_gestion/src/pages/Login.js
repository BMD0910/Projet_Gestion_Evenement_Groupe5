import axios from "axios";
import React, { useState } from "react";
import { useContext } from "react";
import { Link, useNavigate } from "react-router-dom";
//import { AuthContext } from "../context/authContext";
import { stepperClasses } from "@mui/material";

const Login = (props) => {
  
  const [compte, setCompte] = useState({
    username : "" ,
    password : ""      
   });

  sessionStorage.setItem("jwt", null) ;

/***************************************************************************/  
  const [err, setError] = useState("");

  const navigate = useNavigate();


/***************************************************************************/  

  const handleChange = event => {
        
    setCompte({ ...compte, [event.target.name ] : event.target.value });
    
 };


/***************************************************************************/ 
/*const [verifier, setVerifier] = useState(true);

  const connexion = async (compte) =>{
     fetch("http://localhost:8080/login",{
        method: "POST" ,
        headers: {"content-Type" : "application/json"},
        body: JSON.stringify(compte) ,
        })
        .then(response => {
           const jwtToken = response.headers.get("Authorization");
           if (jwtToken != null) {
              sessionStorage.setItem("jwt", jwtToken) ;
              alert(jwtToken) ;
            }
            else
            {
              alert("mot de pass incorect !") ;
            }
           
         }) 
        .catch(err =>alert(err) ) ;
        alert(verifier) ;
 };

 */

 

 const connexion = async (inputs) => {
   const res = await axios.post("http://localhost:8080/login", compte);
   return res ; 
};



 /***************************************************************************/ 


/*const handleSubmit = async () => {
  const jwt = localStorage.getItem('jwt');
    await connexion(compte) ;
    navigate("/");
}*/

/***************************************************************************/ 

  const handleSubmit = async (e) => {
    
    e.preventDefault();
    try {
      const res = await connexion(compte) ;
      alert("connexion avec succes")
      sessionStorage.setItem("username", compte.username) ;
      navigate("/");
    } catch (err) {
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
