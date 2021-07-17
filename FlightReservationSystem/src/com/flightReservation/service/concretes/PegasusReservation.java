package com.flightReservation.service.concretes;

import com.flightReservation.model.Airplain;
import com.flightReservation.service.abstracts.BaseReservationSystem;

import java.util.Random;
import java.util.Scanner;

public class PegasusReservation implements BaseReservationSystem {
    private int numSeats;
    @Override
    public void getReservation(Airplain airplain) {

        System.out.println("*********** \nPegasus Rezervsayon Sistemine hoş geldiniz!\n***********");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Business class uçmak için 1'e basınız. Ekonomi class uçmak içi 2'e basınız");
        System.out.println("1- Business \n2- Ekonomi");
        int selection = scanner.nextInt();

        if(selection == 1){// Business
            System.out.print("BUSİNESS");
            System.out.println(airplain.getSeatsType());
            while (true){
                numSeats = scanner.nextInt();
                boolean seatOccupancy = airplain.getSeats().get(numSeats);
                if(!seatOccupancy){
                    airplain.getSeats().put(numSeats,true);
                    System.out.println(airplain.getSeats() + "\n" + airplain.getSeats());
                }else{
                    System.out.println("Koltuk malesef dolu!");
                }
            }
        }
        else if(selection == 2){//Ekonomi
            System.out.print("EKONOMI");

            System.out.println(airplain.getSeats());
            Random random = new Random();
            int randomSeat = random.nextInt(airplain.getNumSeats());
            while(true){
                if("Ekonomi".equals(airplain.getSeatsType().get(randomSeat))
                        && airplain.getSeats().get(randomSeat) == false){
                    airplain.getSeats().put(randomSeat,true);
                    System.out.println(airplain.getSeats());

                    System.out.println("Koltuk no: "+ randomSeat +" adınıza rezerve edildi! \nİyi uçuşlar!");

                    break;
                }else{
                    System.out.println("Koltuklar doludur!");
                    break;
                }
            }
        }
    }
}
