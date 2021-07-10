package com.company;

import java.util.Scanner;

public class Main {

    /*
    This program is a program that
    calculates discounts according to the selected movie
     and age for movie ticket sales.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int filmCategoryNum;
        int userAge;
        int discount=0;

        //The movie category to be watched is taken from the user
        do { //The loop continues until the user enters values 1-5.
            System.out.println("**** Welcome to our cinema **** \n" +
                    "Please select movie category \n" +
                    "1.Comedy \n" +
                    "2.Science Fiction \n" +
                    "3.Horror \n" + //extra -%10
                    "4.Animation \n" +
                    "5.Other \n");

            filmCategoryNum = scanner.nextInt();

        }while(filmCategoryNum<1 || filmCategoryNum>5);


        System.out.print("Please enter your age: ");
        userAge = scanner.nextInt();

        // Calculation discount
        if(filmCategoryNum==3){
            System.out.println("Congratulations, you've earned 10% off"); // 10% discount on horror movie
            discount+= 10;
        }
        if(userAge>0 && userAge<19){
            System.out.println("Congratulations, you've earned 10% off"); // 10% discount on -18 age
            discount+= 10;
        }
        if(userAge>18 && userAge<26){
            System.out.println("Congratulations, you've earned 5% off"); // 5% discount on between 18-25 age
            discount+= 5;
        }

        System.out.println("Total earned discount is : %"+discount+ ". Have a good time !");

        /*
        Expected Outpu Exa:
        **** Welcome to our cinema ****
        Please select movie category
        1.Comedy
        2.Science Fiction
        3.Horror
        4.Animation
        5.Other

        3
        Please enter your age: 25
        Congratulations, you've earned 10% off
        Congratulations, you've earned 5% off
        Total earned discount is : %15. Have a good time !
         */


    }
}
