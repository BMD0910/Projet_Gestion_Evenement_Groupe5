import React, { useContext } from "react";
import { Link } from "react-router-dom";
import { AuthContext } from "../context/authContext";
import Avatar from '@mui/material/Avatar';
import Stack from '@mui/material/Stack';

import event2 from "../img/event2.png";

const Navbar = () => {
  const { currentUser, logout } = useContext(AuthContext);

  return (
    <div className="navbar">
      <div className="container">
        <div className="logo">
          <Link to="/">
          <img src={event2} alt="" />
          </Link>
        </div>
        <div className="links">
          <Link className="link" to="/">
            <h6>Acceuil</h6>
          </Link>
          <Link className="link" to="/Events">
            <h6>Events</h6>
          </Link>
          <Link className="link" to="/Prestataires">
            <h6>Prestataires</h6>
          </Link>
          <Link className="link" to="/Services">
            <h6>Services</h6>
          </Link>
          
          <span>{currentUser?.username}</span>
          {currentUser ? (
            <span onClick={logout}>Logout</span>
          ) : (
            <Stack direction="row" spacing={2}>
            <Link className="link" to="/login">
            <Avatar src="/broken-image.jpg" />
            </Link>
            </Stack>
          )}
          
        </div>
      </div>
    </div>
  );
};

export default Navbar;
