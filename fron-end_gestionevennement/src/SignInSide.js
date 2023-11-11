import React from "react";
import "./index.css";
import { TextField } from "@mui/material";
import Button from "@mui/material/Button";



 function Desktop()  {
  return (
    <div className="desktop">
      <div className="div">
        <img className="ordinateur" alt="" src="" />
        <div className="rectangle">
        <TextField id="filled-basic" label="Adresse e" variant="filled" />
        </div>
        <div className="rectangle-2">
        <TextField id="filled-basic" label="password" variant="filled" />
        </div>
        <div className="overlap-group">
          <div className="text-wrapper"><Button variant="outlined">LOGIN</Button></div>
        </div>
      </div>
    </div>
  );
};
export default Desktop;

