package com.example.files_and_folders.controllers;

import com.example.files_and_folders.models.Person;
import com.example.files_and_folders.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @PostMapping(value = "/persons")
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
        personRepository.save(person);
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }

    @GetMapping(value = "/persons")
    public List<Person> getAllPersons(){
        return  personRepository.findAll();
    }

    @GetMapping(value = "/persons/{id}")
    public Optional<Person> getPerson(@PathVariable Long id){
        return personRepository.findById(id);
    }


}
