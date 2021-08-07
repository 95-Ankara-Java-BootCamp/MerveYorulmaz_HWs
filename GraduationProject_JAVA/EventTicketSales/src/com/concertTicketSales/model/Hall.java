//package com.concertTicketSales.model;
//
//import java.util.Map;
//
///*
//Etkinlik salonu
//
//A Blok: 25 KİŞİ
//xxx00
//xxxxx
//
//B Blok: 25 KİŞİ
//xxxxx
//x00xx
//
//c Blok: 50 KİŞİ
//xxxxx
//xxxxx
//
// */
//
//public class Hall {
//
//    private final String hallName = "Ankara Opera Sahnesi";
//    private int  emptySeatNum = 100;
//    private final int A_BlockNumSeats = 25;
//    private final int B_BlockNumSeats = 25;
//    private final int C_BlockNumSeats = 50;
//
//    private Map<Integer, Boolean> seats;
//    private Map<Integer, String> seatsType;
//
//    public Hall() {
//    }
//
//    public Hall(int numSeats, Map<Integer, Boolean> seats, Map<Integer, String> seatsType) {
//        this.emptySeatNum = numSeats;
//        this.seats = seats;
//        this.seatsType = seatsType;
//    }
//
//    public String getHallName() {
//        return hallName;
//    }
//
//    public void setNumSeats(int emptySeatNum) {
//        this.emptySeatNum = emptySeatNum;
//    }
//    public int getNumSeats() {
//        return emptySeatNum;
//    }
//
//    public int getA_BlockNumSeats() {
//        return A_BlockNumSeats;
//    }
//
//    public int getB_BlockNumSeats() {
//        return B_BlockNumSeats;
//    }
//
//    public int getC_BlockNumSeats() {
//        return C_BlockNumSeats;
//    }
//
//    public Map<Integer, Boolean> getSeats() {
//        return seats;
//    }
//
//    public void setSeats(Map<Integer, Boolean> seats) {
//        this.seats = seats;
//    }
//
//    public Map<Integer, String> getSeatsType() {
//        return seatsType;
//    }
//
//    public void setSeatsType(Map<Integer, String> seatsType) {
//        this.seatsType = seatsType;
//    }
//}
