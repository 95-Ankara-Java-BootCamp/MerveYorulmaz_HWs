package com.flightReservation;

import com.flightReservation.model.Airplain;
import com.flightReservation.service.abstracts.BaseReservationSystem;
import com.flightReservation.service.concretes.PegasusReservation;
import com.flightReservation.service.concretes.THYRezervation;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Airplain airplain = new Airplain();
        airplain.setId(1);
        airplain.setBusinessNumSeats(5);
        airplain.setNumSeats(10);
        airplain.setDepartureTime(LocalDateTime.of(2021,10,05,14,15));

        Map<Integer,Boolean> seats = new HashMap<>();
        Map<Integer,String> seatsType = new HashMap<>();

        for(int i= 1; i<=airplain.getNumSeats(); i++){
            if(i <= airplain.getBusinessNumSeats()){
                seats.put(i,false);
                seatsType.put(i,"Business");
            }else{
                seats.put(i,false);
                seatsType.put(i,"Ekonomi");
            }
        }

        airplain.setSeats(seats);
        airplain.setSeatsType(seatsType);

        // PEGASUS REZERVASION
        BaseReservationSystem rezervationService = new PegasusReservation();
        rezervationService.getReservation(airplain);

        //THY REZERVASION
        BaseReservationSystem rezervationServiceTHY = new THYRezervation();
        rezervationServiceTHY.getReservation(airplain);

    }
}
