package com.devrobot.springbootecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devrobot.springbootecommerce.model.Reservation;
import com.devrobot.springbootecommerce.repository.ReservationRepository;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {
    
    @Autowired
    private ReservationRepository reservationRepository;

    @PostMapping(value="/")
    public Reservation persist(@RequestBody Reservation reservation){
        reservationRepository.save(reservation);
        return reservationRepository.findById(reservation.getReservationid()).get();
    }

    @GetMapping(value="/")
    public List<Reservation> getAll(){
        return reservationRepository.findAll();
    }

    @GetMapping(value="/{reservationid}")
    public Reservation get(@RequestParam("reservationid") String reservationid){
            return reservationRepository.findById(reservationid).get();
    }


    @PutMapping(value="/{reservationid}")
    public List<Reservation> put(@PathVariable String reservationid,@RequestBody Reservation reservation){
        if(reservationRepository.existsById(reservationid)){
            reservationRepository.deleteById(reservationid);
            reservationRepository.save(reservation);
        }
        return reservationRepository.findAll();
    }

    @DeleteMapping(value="/{reservationid}")
    public List<Reservation> delete(@PathVariable String reservationid){
        reservationRepository.deleteById(reservationid);
        return reservationRepository.findAll();
    }

}
