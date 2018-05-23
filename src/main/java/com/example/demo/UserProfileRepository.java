package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserProfileRepository extends CrudRepository <UserProfile, Long>{

    Iterable<UserProfile> findByFirstName(@Param("firstName") String fn);
    Iterable<UserProfile> findByLastName(@Param("lastName") String ln);
    Iterable<UserProfile> findAll();

} 
