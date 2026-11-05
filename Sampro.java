/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sampro;

/**
 *
 * @author CARDIÑO_CPE113
 */
public class Sampro {

  
    public static void main(String[] args) {

        int[] scores = {120, 118, 110, 105, 90, 78, 88, 70};

        if (scores.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int sum = calculateSum(scores);
        double average = calculateAverage(scores);
        int highest = findHighest(scores);
        int lowest = findLowest(scores);
        int passing = countPassing(scores);

        System.out.println("Total Number of Scores: " + scores.length);
        System.out.println("Sum of Scores: " + sum);
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Number of Passing Students: " + passing);
    }

    public static int calculateSum(int[] scores) {

        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }

        return sum;
    }

    public static double calculateAverage(int[] scores) {

        int sum = calculateSum(scores);
        double average = (double) sum / scores.length;

        return average;
    }

    public static int findHighest(int[] scores) {

        int highest = scores[0];

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
        }

        return highest;
    }

    public static int findLowest(int[] scores) {

        int lowest = scores[0];

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        return lowest;
    }

    public static int countPassing(int[] scores) {

        int passing = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 75) {
                passing++;
            }
        }

        return passing;
    }
}

