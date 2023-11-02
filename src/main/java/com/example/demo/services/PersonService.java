package com.example.demo.services;

import com.example.demo.entities.PersonEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.demo.repositories.PersonRepository;

import java.util.List;

@Service
public class PersonService {

    private PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public ResponseEntity<List<PersonEntity>> getAllPeople() {
        return ResponseEntity.ok(repository.findAll());
    }

}
