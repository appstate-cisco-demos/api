package com.example.demo.controllers;

import com.example.demo.entities.PersonEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.services.PersonService;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {

    private PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    //GET method that returns a list of all the people in the database
    @GetMapping("/getAll")
    public ResponseEntity<List<PersonEntity>> getAllPeople() {
        return service.getAllPeople();
    }

    //POST method that adds a person to the database
    @PostMapping
    public ResponseEntity<PersonEntity> addPerson(@RequestBody PersonEntity body) {
        return service.addPerson(body);
    }

    //PUT method that updates an existing person in the database
    @PutMapping("/{id}")
    public ResponseEntity<PersonEntity> updatePerson(@PathVariable String id, @RequestBody PersonEntity body) {
        return service.updatePerson(id, body);
    }

    //DELETE method that deletes an existing person in the database
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePerson(@PathVariable String id) {
        return service.deletePerson(id);
    }

}
