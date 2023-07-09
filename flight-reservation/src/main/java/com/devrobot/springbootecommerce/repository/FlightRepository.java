package com.devrobot.springbootecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devrobot.springbootecommerce.model.Flight;

public interface FlightRepository extends JpaRepository<Flight,String>{
    
}
