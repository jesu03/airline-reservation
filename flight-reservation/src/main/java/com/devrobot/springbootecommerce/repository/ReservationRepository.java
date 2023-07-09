package com.devrobot.springbootecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devrobot.springbootecommerce.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,String>{
    
}

