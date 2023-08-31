/* D:\Google Drive\UFSC_2017-01\Java como programar 10 edição
pagina 186
// 6.8 (Parking fees) A parking lot charges a minimum fee of R$2.00 to park for up to three hours. an additional
BRL 0.50 per hour, not necessarily full, is charged after the first three hours. The maximum fare for any given period
24 hours is R$ 10.00. Assume that no car is parked for more than 24 hours at a time. Write an application that calculates and
display parking rates for each customer who parked in this garage yesterday. You must enter parking hours
for each customer. The program should display the charge for the current customer and calculate and display the total of yesterday's receipts. He must use
the calculateCharges method to determine the rate for each customer. */
package Questoes_pagina_184.Exercicio_6_8_Parking_java;

import java.util.Scanner;

public class Parking {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double totalTicket = 0;

        System.out.print("Enter total customers: ");
        int CostumersNumber = input.nextInt();

        for (int i = 1; i <= CostumersNumber; i++) {
            System.out.print("Costumer " + i + " - Enter parking hours: ");
            int parkingHours = input.nextInt();

            double value = calculateValues(parkingHours);

            totalTicket += value;

            System.out.printf("Costumer %d: Tarife $ %.2f %n", i, value);

        } // for

        System.out.printf("%n Total Tickets: $ %.2f %n", totalTicket);

        input.close();

    }// main

    public static double calculateValues(int hours) {
        double MinimumValue = 2.0;
        double maxValue = 10.0; // day
        double aditionalValue = 0.5;

        if (hours <= 3) {
            return MinimumValue;
        } // if
        else if (hours <= 24) {
            double AditionalHours = hours - 3;
            double totalValue = MinimumValue + (AditionalHours * aditionalValue);
            return Math.min(totalValue, maxValue); // 20h to 23h are more expensive than 24h
        } // else if
        else {
            return maxValue;
        } // else

    }// calculateValues

}// Parking
