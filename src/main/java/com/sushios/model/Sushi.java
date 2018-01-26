package com.sushios.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sushi {

    @Id
    public String id;

    public String name;
    public Double price;
    public String category;

    public Sushi(String name, Double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString(){
        return "Sushi{"+"name = '" + name + '\'' + " price= "+ price + ", category= " + category + '}';
    }

}
