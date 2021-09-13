package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        final float taxRate = 0.055f;

        System.out.print("Enter the price of item 1: ");
        float item1Price = sc.nextFloat();
        System.out.print("Enter the quantity of item 1: ");
        int item1Quant = sc.nextInt();

        System.out.print("Enter the price of item 2: ");
        float item2Price = sc.nextFloat();
        System.out.print("Enter the quantity of item 2: ");
        int item2Quant = sc.nextInt();

        System.out.print("Enter the price of item 3: ");
        float item3Price = sc.nextFloat();
        System.out.print("Enter the quantity of item 3: ");
        int item3Quant = sc.nextInt();

        //calculate
        float subtotal = (item1Price * item1Quant) + (item2Price * item2Quant) + (item3Price * item3Quant);
        float tax = subtotal * taxRate;
        float total = subtotal + tax;

        //output
        System.out.println( "Subtotal: $" + subtotal + "\nTax: $" + tax + "\nTotal: $" + total );
    }
}
