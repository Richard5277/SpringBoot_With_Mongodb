package com.sushios.controller;

import com.sushios.model.Sushi;
import com.sushios.service.SushiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class SushiController {
    @Autowired
    private SushiService sushiService;

    // Get All Sushi
    @RequestMapping("/allSushi")
    public List<Sushi> getALlSushi() {

        return this.sushiService.getAllSushi();

    }

    // Get sushi by name
    @RequestMapping("/sushi/{name}")
    public Sushi getSushiByName(@PathVariable("name") String name) {

        return this.sushiService.getSushiForName(name);

    }

    // Add sushi
    @RequestMapping(value = "/addSushi")
    public ResponseEntity<String> addSushi( String name, Double price,  String category, Integer stock) {

        this.sushiService.addNewSushi(new Sushi(name, price, category, stock));

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    // Delete Sushi
    @RequestMapping(value = "/deleteSushi")
    public ResponseEntity<String> deleteSushi(@RequestParam(value = "name") String name) {

        this.sushiService.deleteSushi(name);

        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    // Update Sushi
    @RequestMapping(value = "/updateSushi",method = RequestMethod.PUT, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ResponseEntity<String> updateSushi (
            @RequestParam(value = "name") String name,
            String category,
            Double price,
            Integer stock){

        this.sushiService.updateSushi(name, category, price, stock);

        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }


}
