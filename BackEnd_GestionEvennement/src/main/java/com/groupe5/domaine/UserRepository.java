package com.groupe5.domaine;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

@RepositoryRestResource(exported = false)
public interface UserRepository extends CrudRepository<User, Integer>{
    Optional<User> findByUsername (String username);
}
