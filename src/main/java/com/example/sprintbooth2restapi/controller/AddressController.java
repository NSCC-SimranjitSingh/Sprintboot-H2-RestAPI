package com.example.sprintbooth2restapi.controller;

import com.example.sprintbooth2restapi.model.Address;
import com.example.sprintbooth2restapi.repository.AddressRepository;
import com.example.sprintbooth2restapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AddressController {

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    PersonRepository personRepository;

    @PostMapping("/person/{personId}/address")
    public ResponseEntity<Address> createAddress(@PathVariable(value="personId") Long personId,
    @RequestBody Address address ){

        personRepository.findById(personId).map(
                person -> { address.setPerson(person);
                return addressRepository.save(address);
                }  );

        return new ResponseEntity<>(address, HttpStatus.CREATED);
    }
}
