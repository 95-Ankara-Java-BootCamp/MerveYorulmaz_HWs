package com.concertTicketSales.model;

import java.awt.*;
import java.util.Map;

public class Event {

    private int eventID;
    private String eventType;
    private String eventName;
    private String eventAddress;
    private String eventDate;

    private int  numSeats;
    private int A_BlockNumSeats;

    private Map<Integer, Boolean> seats;
    private Map<Integer, String> seatsType;

    public Event() {
    }

    public Event(int eventID, String eventType, String eventName, String eventAddress, String eventDate, int numSeats,
                 int a_BlockNumSeats, Map<Integer, Boolean> seats, Map<Integer, String> seatsType) {
        this.eventID = eventID;
        this.eventType = eventType;
        this.eventName = eventName;
        this.eventAddress = eventAddress;
        this.eventDate = eventDate;
        this.numSeats = numSeats;
        A_BlockNumSeats = a_BlockNumSeats;
        this.seats = seats;
        this.seatsType = seatsType;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventAddress() {
        return eventAddress;
    }

    public void setEventAddress(String eventAddress) {
        this.eventAddress = eventAddress;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public int getA_BlockNumSeats() {
        return A_BlockNumSeats;
    }

    public void setA_BlockNumSeats(int a_BlockNumSeats) {
        A_BlockNumSeats = a_BlockNumSeats;
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
}
