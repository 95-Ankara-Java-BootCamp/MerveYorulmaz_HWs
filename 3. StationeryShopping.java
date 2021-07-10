package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    /*
    This program keeps the product name and quantity bought by a stationer.
     */

    public static void main(String[] args) {

        System.out.println("**** Welcome to the product adding system **** ");

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> productList = new HashMap<String, Integer>();

        String nameProduct;
        int numProduct;
        int exitNum=1;
        boolean value = true; // loop out control

        //enter product loop
        while (exitNum==1){
            System.out.print("Enter the name of the product: ");
            nameProduct = scanner.nextLine();

            System.out.print("Enter the number of products: ");
            numProduct = scanner.nextInt();

            if(!productList.isEmpty()) {
                for (String productNameinList : productList.keySet()) { // check if the product is on the list
                    if (productNameinList.equals(nameProduct)) {
                        //productList.computeIfPresent(nameProduct,(k,v)-> v+ numProduct);
                        productList.put(nameProduct, productList.get(nameProduct) + numProduct);
                    } else { // If the product is not in the list, it is added to the list with the new product quantity.
                        productList.put(nameProduct, numProduct);
                    }
                }
            }else{
                productList.put(nameProduct, numProduct);
            }

            // show all print list
            ShowProductList(productList);
            System.out.println("Do you want to continue? (Yes:1 / No:0)");
            exitNum = scanner.nextInt();

        }
        System.out.println("Goodbye..");

    }

    public static void ShowProductList(HashMap productList){
        for (Object i : productList.keySet()) {
            System.out.println("Product name : " + i + " Product Number: " + productList.get(i));
        }
        return;
    }
}

