/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.esprikitik;

/**
 *
 * @author CARDIÑO_CPE113
 */
public class ESPRIKITIK {

    public static void main(String[] args) {

        double consumption = 300;
        double rate = 11.50;
        double percentage = 5;

        double consumptionCharge = calculateConsumptionCharge(consumption, rate);
        double additionalCharge = calculateAdditionalCharge(consumptionCharge, percentage);
        double totalBill = calculateTotalBill(consumptionCharge, additionalCharge);

        System.out.printf("Consumption Charge: P%.2f%n", consumptionCharge);
        System.out.printf("Additional Charge: P%.2f%n", additionalCharge);
        System.out.printf("Total Electricity Bill: P%.2f%n", totalBill);
    }

    public static double calculateConsumptionCharge(
            double consumption, double rate) {

        double charge = consumption * rate;
        return charge;
    }

    public static double calculateAdditionalCharge(
            double consumptionCharge, double percentage) {

        double additional = consumptionCharge * percentage / 100;
        return additional;
    }

    public static double calculateTotalBill(
            double consumptionCharge, double additionalCharge) {

        double total = consumptionCharge + additionalCharge;
        return total;
    }
}

    

