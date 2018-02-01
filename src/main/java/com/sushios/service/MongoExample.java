package com.sushios.service;

import com.sushios.model.Sushi;
import com.sushios.repository.SushiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MongoExample implements CommandLineRunner {

    @Autowired
    private SushiRepository repository;

    @Override
    public void run(String... args) throws Exception {

//        repository.deleteAll();
//
//        repository.save( new Sushi("Spring Roll",2.50, "Roll", 300));
//
//        repository.save( new Sushi("Miso Soup",3.50, "Soup", 200));

    }

}
