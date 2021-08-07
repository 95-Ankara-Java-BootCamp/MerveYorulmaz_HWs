package com.concertTicketSales.service.concretes;

import com.concertTicketSales.model.Event;
import com.concertTicketSales.service.abstratcs.BaseTicketSalesSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class DevletTiyatrolariTicketSales implements BaseTicketSalesSystem {
    @Override
    public void getTicketSales(Event event) {



        System.out.println("*********************************\n" +
                "Devlet Tiyatrolari Bilet Satış Noktamıza Hoş Geldiniz\n" +
                "Tiyatro / Bir Delinin Hatıra Defteri ( 21 Ağustos 2021 / 20:00 )\n"+"etkinliği bilet satış sayfası\n"+
                "*********************************\n");

        Scanner scanner = new Scanner(System.in);

        //ticket num list
        List ticketNumList = new ArrayList<>();
        String blokName;

        //Blok selection
        System.out.println("Koltuk Blok seçimi yapınız");
        System.out.println("1- ÖN BLOK \n2- ARKA BLOK");
        int selection = scanner.nextInt();

        //Custom role
        System.out.print("1. Tam bilet (60 TL) \n2. Öğrenci Bilet(45 TL)");
        System.out.print("\n");
        int customRole = scanner.nextInt();

        //ticket num
        System.out.print("Bilet sayısı giriniz : ");
        int ticketNum = scanner.nextInt();
        System.out.print("\n");

        if (selection == 1) {// ÖN BLOK
            System.out.print("ÖN BLOK");

            for(int i=0; i<ticketNum; i++){
                System.out.println(event.getSeats()+"\n");
                Random random = new Random();
                int randomSeat = 1+random.nextInt(event.getA_BlockNumSeats());
                while(true){
                    if("BLOK".equals(event.getSeatsType().get(randomSeat))
                            && event.getSeats().get(randomSeat) == false){
                        event.getSeats().put(randomSeat,true);
                        System.out.println(event.getSeats());

                        System.out.println("Koltuk no: "+ randomSeat +" adınıza rezerve edildi! \nİyi seyirler!");

                        ticketNumList.add(randomSeat);
                        blokName="ÖN BLOK";

                        break;
                    }else{
                        System.out.println(randomSeat+" numaralı Koltuklar doludur!");
                        ticketNum--;
                        break;
                    }
                }
            }



        }
        else if(selection == 2){
            System.out.print("ARKA BLOK");

            for(int i=0; i<ticketNum; i++) {

                System.out.println(event.getSeats() + "\n");
                //int random = (int)(Math.random()*6);
                Random random = new Random();
                int randomSeat = 1+random.nextInt(event.getNumSeats());
                while (true) {
                    if ("BLOK".equals(event.getSeatsType().get(randomSeat))
                            && event.getSeats().get(randomSeat) == false) {
                        event.getSeats().put(randomSeat, true);
                        System.out.println(event.getSeats());

                        System.out.println("Koltuk no: " + randomSeat + " adınıza rezerve edildi! \nİyi seyirler!");

                        ticketNumList.add(randomSeat);
                        blokName="ARKA BLOK";

                        break;
                    } else {
                        System.out.println(randomSeat+" numaralı Koltuklar doludur!");
                        ticketNum--;
                        break;
                    }
                }
            }
        }

        String customRole_;
        int ticketPrice;
        if(customRole==1){ customRole_="Tam bilet (60 TL)"; ticketPrice=60; }
        else{ customRole_="Öğrenci (45 TL) "; ticketPrice=45;}

        if(selection==1){ blokName="ÖN BLOK";}
        else{ blokName="ARKA BLOK";}

    //print ticket
        System.out.println("************************************ T İ C K E T ************************************\n");
        System.out.print("Tiyatro / Bir Delinin Hatıra Defteri ( 21 Ağustos 2021 / 20:00 ) etkinliği için: \n"+
                ticketNum +" adet bilet aldınız.\n");
        System.out.print("\nBilet Koltuk Numaraları: ");
        for(int i=0; i<ticketNumList.size();i++){
            System.out.print(blokName +"/"+ticketNumList.get(i)+" - ");
        }
        System.out.print("\nBilet Fiyatı : "+ customRole_ + " * " + ticketNum + " = "+ ticketPrice*ticketNum +" TL\n");
        System.out.print("\nİYİ SEYİRLER!\n");
        System.out.println("************************************ T İ C K E T ************************************\n");

    }
}
