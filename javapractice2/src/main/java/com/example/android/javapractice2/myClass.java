package com.example.android.javapractice2;

public class myClass {

    public static void main(String[] args) {
    getMilk(2);
    System.out.println("");
    getMilk(15);

    }

    public static void getMilk(int noOfCartonstobuy){

        int priceToPay = noOfCartonstobuy * 2;

        System.out.println("Open Door");
        System.out.println("Walk to Store");
        System.out.println("Buy " + noOfCartonstobuy + " milk on the ground floor");
        System.out.println("Pay " + priceToPay + " pounds. but no more.");
        System.out.println("Return home with milk galore");

    }
}
