package com.groupe5.domaine;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

@RepositoryRestResource(exported=false)
public interface UserRepository extends CrudRepository<User, Integer>{
    /*Cette méthode est utilisée pour rechercher un utilisateur dans la base de données lors du processus d'authentification. */
    Optional<User> findByUsername (String username);
}
