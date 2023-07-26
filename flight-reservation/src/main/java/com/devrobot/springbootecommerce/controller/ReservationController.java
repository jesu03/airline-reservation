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
import com.devrobot.springbootecommerce.service.ReservationService;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {
    
    @Autowired
    private ReservationService reservationService;

    @PostMapping(value="/")
    public Reservation persist(@RequestBody Reservation reservation){
        reservationService.save(reservation);
        return reservationService.findById(reservation.getReservationid()).get();
    }

    @GetMapping(value="/")
    public List<Reservation> getAll(){
        return reservationService.findAll();
    }

    @GetMapping(value="/{reservationid}")
    public Reservation get(@RequestParam("reservationid") String reservationid){
            return reservationService.findById(reservationid).get();
    }


    @PutMapping(value="/{reservationid}")
    public List<Reservation> put(@PathVariable String reservationid,@RequestBody Reservation reservation){
        if(reservationService.existsById(reservationid)){
            reservationService.deleteById(reservationid);
            reservationService.save(reservation);
        }
        return reservationService.findAll();
    }

    @DeleteMapping(value="/{reservationid}")
    public List<Reservation> delete(@PathVariable String reservationid){
        reservationService.deleteById(reservationid);
        return reservationService.findAll();
    }

}
