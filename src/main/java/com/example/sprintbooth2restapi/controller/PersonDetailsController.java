package com.example.sprintbooth2restapi.controller;

import com.example.sprintbooth2restapi.model.Person;
import com.example.sprintbooth2restapi.model.PersonDetail;
import com.example.sprintbooth2restapi.repository.PersonDetailRepository;
import com.example.sprintbooth2restapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PersonDetailsController {

    @Autowired
    PersonRepository personRepository;
    @Autowired
    PersonDetailRepository personDetailRepository;

   /* @PostMapping("person/{person_id/detail}")
    public ResponseEntity<PersonDetail> createPersonDetails(
            @PathVariable(value = "person_id" ) long personId,
            @RequestBody PersonDetail personDetail){


    }*/
}
