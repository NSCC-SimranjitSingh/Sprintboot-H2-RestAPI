package com.example.sprintbooth2restapi.controller;

import com.example.sprintbooth2restapi.model.Person;
import com.example.sprintbooth2restapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("/persons")
    public ResponseEntity<List<Person>> getAllPersons(){

        List<Person> persons = new ArrayList<Person>();

        personRepository.findAll().forEach(persons::add);

        return new ResponseEntity<>(persons, HttpStatus.OK);

    }

    @PostMapping("/person")
    public ResponseEntity<Person> createPerson(@RequestBody Person person){

        Person newperson = personRepository.save(new Person(person.getName(), person.getDescription()));

        return new ResponseEntity<>(newperson, HttpStatus.CREATED);
    }
/*
    @DeleteMapping("/persons")
    public ResponseEntity<HttpStatus> deleteAllPersons(){

        personRepository.deleteAll();
        return  new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

    @DeleteMapping("/person/{id}")
    public ResponseEntity<HttpStatus> deletePerson(@PathVariable("id") long id){
        try {
            personRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e){
            return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }*/




}
