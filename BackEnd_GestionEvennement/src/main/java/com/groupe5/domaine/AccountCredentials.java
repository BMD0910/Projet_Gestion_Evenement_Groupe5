package com.groupe5.domaine;

// Class pour les informations de Connexion d'un user(username and password)
public class AccountCredentials {

    private String username;
    private String password;
    
// les gtters et les setters
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
}
