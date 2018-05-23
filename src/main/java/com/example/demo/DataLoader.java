package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    UserProfileRepository repo;


    @Override
    public void run(String... strings) throws Exception {

        System.out.println("loading...");
        repo.save(new UserProfile("Tyler","Davis"));
        repo.save(new UserProfile("Chet","Patel"));
        repo.save(new UserProfile("Jiten","Patel"));
        repo.save(new UserProfile("Mike","Miller"));
        System.out.println("...loaded");
    }
}
