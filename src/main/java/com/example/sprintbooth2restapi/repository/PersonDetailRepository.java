package com.example.sprintbooth2restapi.repository;

import com.example.sprintbooth2restapi.model.PersonDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  PersonDetailRepository extends JpaRepository<PersonDetail, Long> {
}
