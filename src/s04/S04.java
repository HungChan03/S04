/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s04;

import java.util.InputMismatchException;
import java.util.Scanner;
import s04.Lib;

/**
 * s04Fuel Economy
 *
 * @author Hungnhcce180150
 *
 */
public class S04 {

    /**
     *
     * @param message to display if user enter valid input
     * @param errorMessage to display if user enter invalid input
     * @return n The integer value entered by the user.
     */
    public static int GetInteger(String message, String errorMessage) {
        Scanner sc = new Scanner(System.in);
        boolean isOk = false;  //to control the loop
        int n = 0;  //create n to store integer input
        do {
            try {
                System.out.println(message);
                n = Integer.parseInt(sc.nextLine());   //convert input to integer number
                isOk = true;
            } catch (Exception e) {
                System.out.println(errorMessage); //// Print error message if an exception occurs or input is invalid
            }
        } while (!isOk); // Continue looping until a valid input is received
        return n;
    }

    /**
     * the main method
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input
        Code fuelEconomyCalculator = new Code(); // Create an instance of Code
        int choice = 0;
        boolean isOk;

        do {

            // Display menu options to the user
            System.out.println("Choose a function:");
            System.out.println("1. Calculate Fuel Economy");
            System.out.println("2. Calculate Distance Traveled");
            System.out.println("3. Revised Fuel Economy Calculation");
            System.out.println("4.Exit Program");

            isOk = false;
            do {
                choice = GetInteger("Please select a function: ", "The function must be form 1 to 4.");

                if (choice < 1 || 4 < choice) {
                    System.out.println(">>>Error! The function must be from 1 to 4!");  //print error message 
                } else {
                    isOk = true;
                }
            } while (!isOk);

            if (choice == 1) {
                // Prompt user for the number of minutes driven and validate input
                int minutes = Lib.GetPositiveInteger("How many minutes you drive: ", "Please enter positive number");

                // Prompt user for the average speed of the car and validate input
                double speed = Lib.GetPositiveInteger("What was the average speed of car during that time?", "Please enter positive number");

                // Prompt user for the amount of gasoline consumed and validate input
                double gasolineConsumed = Lib.GetPositiveInteger("How many gallons of gas did your car use?", "Please enter positive number");

                // Calculate fuel economy using the provided inputs
                double fuelEconomy = fuelEconomyCalculator.calculateFuelEconomy(minutes, speed, gasolineConsumed);

                // Print the calculated fuel economy
                System.out.printf("Your car averaged: %.2f miles per gallon%n", fuelEconomy);
            }

            if (choice == 2) {
                // Prompt user for the tire radius and validate input
                double tireRadius = Lib.GetPositiveInteger("What is the radius of your tires (in inches): ", "Please enter positive number");

                // Prompt user for the number of tire revolutions and validate input
                int revolutions = Lib.GetPositiveInteger("How many revolutions did your car's tires make:", "Please enter positive number");

                // Calculate the distance traveled using the provided inputs
                double distanceTraveled = fuelEconomyCalculator.calculateDistanceTraveled(tireRadius, revolutions);

                // Print the calculated distance traveled
                System.out.printf("Your car traveled: %.2f miles%n", distanceTraveled);
            }

            if (choice == 3) {
                // Prompt user for the tire radius and validate input
                double tireRadius = Lib.GetPositiveInteger("What is the radius of the tires (in inches)", "Please enter positive number");

                // Prompt user for the number of tire revolutions and validate input
                int revolutions = Lib.GetPositiveInteger("How many revolutions did your car's tire make", "Please enter positive number");

                // Prompt user for the amount of gasoline consumed and validate input
                System.out.println("How many gallons of gas did your car use");
                double gasolineConsumed = Lib.GetPositiveInteger("How many gallons of gas did your car use", "Please enter positive number");

                // Calculate revised fuel economy using the provided inputs
                double revisedFuelEconomy = fuelEconomyCalculator.revisedFuelEconomy(tireRadius, revolutions, gasolineConsumed);

                // Print the calculated revised fuel economy
                System.out.printf("Your car averaged: %.2f miles per gallon%n", revisedFuelEconomy);
            }

            if (choice == 4) {
                System.exit(0);
            }
        } while (true); // Continue looping until a valid choice is made

    }

}
