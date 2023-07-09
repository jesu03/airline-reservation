package com.devrobot.springbootecommerce.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Reservation {
    @Id
    private String reservationid;
    private int noofpass;
    private LocalDate reservationdate;
    @ManyToOne
    private User userid;
    @ManyToOne
    private Flight flightid;
    public int getNoofpass() {
        return noofpass;
    }
    public void setNoofpass(int noofpass) {
        this.noofpass = noofpass;
    }
    public String getReservationid() {
        return reservationid;
    }
    
    public void setReservationid(String reservationid) {
        this.reservationid = reservationid;
    }
    public LocalDate getReservationdate() {
        return reservationdate;
    }
    public void setReservationdate(LocalDate reservationdate) {
        this.reservationdate = reservationdate;
    }
    public User getUserid() {
        return userid;
    }
    public void setUserid(User userid) {
        this.userid = userid;
    }
    public Flight getFlightid() {
        return flightid;
    }
    public void setFlightid(Flight flightid) {
        this.flightid = flightid;
    }
    public Reservation() {
    }
    public Reservation(int noofpass, String reservationid, LocalDate reservationdate, User userid, Flight flightid) {
        this.noofpass = noofpass;
        this.reservationid = reservationid;
        this.reservationdate = reservationdate;
        this.userid = userid;
        this.flightid = flightid;
    }
    

}
