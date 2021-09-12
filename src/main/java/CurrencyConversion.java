/*
 *  UCF COP3330 Fall 2021 Exercise 11 Solution
 *  Copyright 2021 Maxwell Graeser
 */

import java.util.Scanner;
import java.lang.Math;
public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        double euros = scan.nextDouble();
        System.out.print("What is the exchange rate? ");
        double rate = scan.nextDouble();

        double dollars = euros * rate;
        double roundDollars = (double) Math.round(dollars * 100) / 100;
        System.out.println(String.format("%.2f euros at an exchange rate of %.4f is\n%.2f U.S. dollars", euros, rate, roundDollars));
    }
}