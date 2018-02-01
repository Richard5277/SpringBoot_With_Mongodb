package com.sushios.service;

import com.sushios.model.Sushi;
import com.sushios.repository.SushiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SushiService {

    private SushiRepository sushiRepository;

    @Autowired
    public SushiService(SushiRepository sushiRepository) {
        this.sushiRepository = sushiRepository;
    }

    public Sushi getSushiForName(String name){
        System.out.println("Service Layer\n👉 ===");
        System.out.println(this.sushiRepository.findByName(name));
        System.out.println("👈 ===");
        return this.sushiRepository.findByName(name);
    }

    public List<Sushi> getAllSushi(){
        return this.sushiRepository.findAll();
    }

    public void addNewSushi(Sushi sushi){
        this.sushiRepository.save(sushi);
    }

    public void deleteSushi(String name){

        Sushi sushi = this.sushiRepository.findByName(name);
        this.sushiRepository.delete(sushi);
    }

    public void updateSushi(String name, String category, Double price, Integer stock){
        Sushi sushi = this.sushiRepository.findByName(name);

        // does this update???
        sushi.setCategory( category!= null ? category : sushi.getCategory());
        sushi.setPrice(price!= null ? price : sushi.getPrice());
        sushi.setStock(stock!= null ? stock : sushi.getStock());

        this.sushiRepository.save(sushi);

    }

}
