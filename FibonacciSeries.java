package com.company;

import java.util.Scanner;

public class FibonacciSeries {

    // Fibonacci Series:
    // 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ... continue...

    public static void main(String[] args) {

        int fibonacci1 = 0;
        int fibonacci2 = 1;
        int nextFibonacci;

        // first 10 number of Fibonacci
        System.out.print("Fibonacci Series ---> ");
        for(int i=0; i<10; i++){
            // 1+2=3 --> 2+3 -----> so fibo1=2 fibo2=3
            nextFibonacci = fibonacci1 + fibonacci2;
            System.out.print(nextFibonacci+" ");
            fibonacci1 = fibonacci2;
            fibonacci2 = nextFibonacci;
        }
    }
}

// Expected Output : Fibonacci Series ---> 1 2 3 5 8 13 21 34 55 89

