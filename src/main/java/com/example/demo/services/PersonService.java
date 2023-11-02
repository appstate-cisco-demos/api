package com.example.demo.services;

import com.example.demo.entities.PersonEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.demo.repositories.PersonRepository;
import org.springframework.web.server.ResponseStatusException;

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

    public ResponseEntity<PersonEntity> addPerson(PersonEntity body) {
        return ResponseEntity.ok(repository.save(body));
    }

    public ResponseEntity<PersonEntity> updatePerson(String id, PersonEntity body) {
        checkIfExists(id);
        body.setId(id);
        return ResponseEntity.ok(repository.save(body));
    }

    public ResponseEntity<String> deletePerson(String id) {
        checkIfExists(id);
        PersonEntity person = repository.findById(id).get();
        repository.deleteById(id);
        return ResponseEntity.ok(String.format(
                "Deleted {_id: %s, firstName: %s, lastName: %s, age: %d}",
                person.getId(), person.getFirstName(), person.getLastName(), person.getAge()));
    }

    public void checkIfExists(String id) {
        if (!repository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    String.format("person by id: %s does not exist", id));
        }
    }

}
