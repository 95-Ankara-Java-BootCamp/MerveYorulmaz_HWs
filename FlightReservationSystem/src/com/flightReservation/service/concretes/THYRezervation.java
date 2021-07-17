package com.flightReservation.service.concretes;

import com.flightReservation.model.Airplain;
import com.flightReservation.service.abstracts.BaseReservationSystem;

import java.util.Scanner;

public class THYRezervation implements BaseReservationSystem {
    private int numSeats;

    @Override
    public void getReservation(Airplain airplain) {

        System.out.println("*********** \nTHY Rezervsayon Sistemine hoş geldiniz!\n***********");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Koltik Tipi Seçiniz?");
        System.out.println("1- Business \n2- Ekonomi");
        int selection = scanner.nextInt();

        System.out.println(airplain.getSeatsType());
        while (true){
            numSeats = scanner.nextInt();
            boolean koltukDoluluk = airplain.getSeats().get(numSeats);
            if(!koltukDoluluk){
                airplain.getSeats().put(numSeats,true);
                System.out.println(airplain.getSeats() + "\n" + airplain.getSeatsType());
                System.out.println("Koltuk no: "+ numSeats +" adınıza rezerve edildi! \nİyi uçuşlar!");
            }else{
                System.out.println("Koltuk malesef dolu!");
            }
        }

    }
}
