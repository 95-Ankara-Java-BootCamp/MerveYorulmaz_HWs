package com.company;

import java.util.Scanner;

/*
    Meyveler ve KG Fiyatları

    Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patlıcan : 5,00 TL
 */
public class ManavKasaProgramı {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double totalPrice=0;

        System.out.println("Armut Kaç kilo ? : ");
        double armutKG = input.nextInt();
        totalPrice+= armutKG*2.14;

        System.out.println("Elma Kaç kilo ? : ");
        double elmaKG = input.nextDouble();
        totalPrice+= elmaKG*3.67;

        System.out.println("Domates Kaç kilo ? : ");
        double domatesKG = input.nextDouble();
        totalPrice+= domatesKG*1.11;

        System.out.println("Muz Kaç kilo ? : ");
        double muzKG = input.nextDouble();
        totalPrice+= muzKG*0.95;

        System.out.println("Patlıcan Kaç kilo ? : ");
        double patlicanKG = input.nextDouble();
        totalPrice+= patlicanKG*5.00;

        System.out.println("Toplam Tutar : "+totalPrice+ " TL" );

    }
}
