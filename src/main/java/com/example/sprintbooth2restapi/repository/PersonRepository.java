package com.example.sprintbooth2restapi.repository;

import com.example.sprintbooth2restapi.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
