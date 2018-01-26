package com.sushios.controller;

import com.sushios.model.Sushi;
import com.sushios.repository.SushiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.zalando.logbook.HttpRequest;
import org.zalando.logbook.Logbook;
import org.zalando.logbook.RequestFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@ControllerAdvice
@RestController
public class SushiController {



    @Autowired
    private SushiRepository sushiRepository;

    private Logbook logbook = Logbook.create();

    // Get All Sushi
    @RequestMapping("/allSushi")
    public List<Sushi> getALlSushi(HttpServletRequest request) {

        System.out.println("👻 👻 👻 request >> " + request);
        System.out.println("👻 👻 👻 log >> " + logbook);

        return sushiRepository.findAll();

    }

    // Get sushi by name
    @RequestMapping("/sushi/{name}")
    public List<Sushi> getSushiByName(@PathVariable("name") String name) { return sushiRepository.findByName(name); }

    // Add sushi
    @RequestMapping("/addSushi")
    public ResponseEntity<String> addSushi(HttpServletRequest request, HttpServletResponse response, @RequestBody String name, Double price, String category, Logbook logbook) {

        System.out.println("👽 👽 👽 Request >> " + request);
        System.out.println("👽 👽 👽 Response >> " + response);
        System.out.println("👽 👽 👽 Log >> " + logbook);
        sushiRepository.save(new Sushi(name, price, category));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    // Delete Sushi

    // Update Sushi


}
