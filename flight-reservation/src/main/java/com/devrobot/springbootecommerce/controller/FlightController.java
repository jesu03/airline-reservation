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

import com.devrobot.springbootecommerce.model.Flight;
import com.devrobot.springbootecommerce.repository.FlightRepository;



@RestController
@RequestMapping("api/flights")
public class FlightController {
    
    @Autowired
    private FlightRepository flightRepository;

    @PostMapping(value="/")
    public Flight persist(@RequestBody Flight flight){ 
        flightRepository.save(flight); 
        return flightRepository.findById(flight.getFlightid()).get(); 
    }

    @GetMapping(value="/")
    public List<Flight> getAll(){
        return flightRepository.findAll();
    }

    @GetMapping(value="/{flightid}")
    public Flight get(@RequestParam("flightid") String flightid){
        return flightRepository.findById(flightid).get();
    }

    @PutMapping(value = "/{flightid}") 
    public List<Flight> put(@PathVariable String flightid,@RequestBody Flight flight){
        if (flightRepository.existsById(flightid)) {
			flightRepository.deleteById(flightid);
			flightRepository.save(flight);
		}
		return flightRepository.findAll();
    }  

    @DeleteMapping(value="/{flightid}")
    public List<Flight> delete(@PathVariable String flightid){
        flightRepository.deleteById(flightid);
        return flightRepository.findAll();
    }
}

