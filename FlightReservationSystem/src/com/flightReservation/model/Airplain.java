package com.flightReservation.model;

import java.time.LocalDateTime;
import java.util.Map;

public class Airplain {

    private int id;
    private int numSeats;
    private int businessNumSeats;
    private Map<Integer, Boolean> seats;
    private Map<Integer, String> seatsType;
    private LocalDateTime departureTime;

    //constructor
    public Airplain(){}


    //gettet&setter funct's
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {

        if(numSeats < 10){
            numSeats = 10;
        }
        this.numSeats = numSeats;
    }

    public int getBusinessNumSeats() {
        return businessNumSeats;
    }

    public void setBusinessNumSeats(int businessNumSeats) {
        this.businessNumSeats = businessNumSeats;
    }

    public Map<Integer, Boolean> getSeats() {
        return seats;
    }

    public void setSeats(Map<Integer, Boolean> seats) {
        this.seats = seats;
    }

    public Map<Integer, String> getSeatsType() {
        return seatsType;
    }

    public void setSeatsType(Map<Integer, String> seatsType) {
        this.seatsType = seatsType;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }
}
