package com.devrobot.springbootecommerce.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flight {

    @Id
    private String flightid;
    private String source;
    private String destination;
    private int capacity;
    private int price;
    public String getFlightid() {
        return flightid;
    }
    public void setFlightid(String flightid) {
        this.flightid = flightid;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public Flight() {
    }
    public Flight(String flightid, String source, String destination, int capacity, int price) {
        this.flightid = flightid;
        this.source = source;
        this.destination = destination;
        this.capacity = capacity;
        this.price = price;
    }
    
}
