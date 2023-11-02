package com.example.demo.controllers;

import com.example.demo.entities.PersonEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.services.PersonService;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {

    private PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<PersonEntity>> getAllPeople() {
        return service.getAllPeople();
    }

//    @GetMapping("/getAll")
//    public String test() {
//        return "hello";
//    }
}
