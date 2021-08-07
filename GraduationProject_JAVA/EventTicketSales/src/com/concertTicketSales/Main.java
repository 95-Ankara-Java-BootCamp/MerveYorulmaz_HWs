package com.concertTicketSales;

import com.concertTicketSales.model.Event;
import com.concertTicketSales.service.abstratcs.BaseTicketSalesSystem;
import com.concertTicketSales.service.concretes.AnkaraOperaSahnesiTicketSales;
import com.concertTicketSales.service.concretes.DevletTiyatrolariTicketSales;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // List<Event> eventList = new ArrayList<>();


        //create event
        Event event = new Event();
        event.setEventID(1);
        event.setA_BlockNumSeats(5);
        event.setNumSeats(30);

        Map<Integer,Boolean> seats = new HashMap<>();
        Map<Integer,String> seatsType = new HashMap<>();

        //create seats
        for(int i= 1; i<=event.getNumSeats(); i++){
            if(i <= event.getA_BlockNumSeats()){
                seats.put(i,false);
                seatsType.put(i,"BLOK");
            }
            else{
                seats.put(i,false);
                seatsType.put(i,"BLOK");
            }
        }

        event.setSeats(seats);
        event.setSeatsType(seatsType);


        //start menü
        int eventSelection=0;
        do{
            System.out.println("*********************************\n" +
                    "Bilet Satış Noktamıza Hoş Geldiniz\n"+
                    "*********************************\n"+
                    "Etkinlik türü için seçim yapınız :\n"+
                    "----- 1. Opera/Bale\n"+
                    "----- 2. Tiyatrolar\n");

            try{
                Scanner scanner = new Scanner(System.in);

                eventSelection = scanner.nextInt();
                if(eventSelection==1){
                    //opera bale
                    BaseTicketSalesSystem ticketSalesSystemBale = new AnkaraOperaSahnesiTicketSales();
                    ticketSalesSystemBale.getTicketSales(event);
                }
                else if(eventSelection==2){
                    //Tiyatrolar
                    BaseTicketSalesSystem ticketSalesSystemTiyatro = new DevletTiyatrolariTicketSales();
                    ticketSalesSystemTiyatro.getTicketSales(event);
                }else{
                    System.out.println("Lütfen menüdeki rakamlardan seçiniz");
                }
            }catch (Exception e){};

        }while(eventSelection!=1 && eventSelection!=2);


    }


}
