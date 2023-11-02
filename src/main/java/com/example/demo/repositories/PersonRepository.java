package com.example.demo.repositories;

import com.example.demo.entities.PersonEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<PersonEntity, String> {
}
