package com.groupe5.domaine.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.groupe5.domaine.model.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

//@RepositoryRestResource(exported=false)
public interface UserRepository extends CrudRepository<User, Integer>{
    /*Cette méthode est utilisée pour rechercher un utilisateur dans la base de données lors du processus d'authentification. */
    Optional<User> findByUsername (String username);

    @Query("select u.idUser from  User u where u.username = username")
    int findIdByUsername (String  username);
}
