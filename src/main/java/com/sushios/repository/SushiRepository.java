package com.sushios.repository;


import com.sushios.model.Sushi;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface SushiRepository extends MongoRepository<Sushi, String> {

    Sushi findByName(String name);

//    void updateSushi(Sushi sushi);

}
