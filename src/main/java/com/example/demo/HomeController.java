package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @Autowired
    UserProfileRepository repo;


    @RequestMapping("/hello")
    public String hello(){
        return "Hello world";
    }

    @RequestMapping("/findall")
    public Iterable<UserProfile> findAll(){
        return repo.findAll();
    }

    @RequestMapping("/findbyfirstname/{firstName}")
    public Iterable<UserProfile> findByFirstName(@PathVariable String firstName){
        return repo.findByFirstName(firstName);
    }

    @RequestMapping("/findbylastname/{lastName}")
    public Iterable<UserProfile> findByLastName(@PathVariable String lastName){
        return repo.findByLastName(lastName);
    }

    @RequestMapping(value="/insert", method= RequestMethod.POST)
    public void insert(@RequestBody UserProfile up){
        repo.save(up);
    }

} 
