package com.example.sprintbooth2restapi.repository;

import com.example.sprintbooth2restapi.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findByPersonId(Long personId);
}
