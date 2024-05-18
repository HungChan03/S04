/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s04;

/**
 *
 * @author Admin
 */
public class Code {
    /**
     * Method to calculate fuel economy in miles per gallon.
     * 
     * @param minutes          the number of minutes the car has traveled.
     * @param speed            the speed of the car in miles per hour.
     * @param gasolineConsumed the amount of gasoline consumed in gallons.
     * @return the fuel efficiency in miles per gallon, rounded to two decimal places.
     */
    public double calculateFuelEconomy(int minutes, double speed, double gasolineConsumed) {
        double hours = minutes / 60.0; // Convert minutes to hours
        double distance = speed * hours; // Calculate distance traveled
        return distance / gasolineConsumed; // Calculate miles per gallon
    }

    /**
     * Method to calculate the distance traveled based on tire radius and revolutions.
     * 
     * @param tireRadius  the radius of the tires in inches.
     * @param revolutions the number of revolutions of the tires.
     * @return the distance traveled in miles, rounded to two decimal places.
     */
    public double calculateDistanceTraveled(double tireRadius, int revolutions) {
        double circumference = 2 * Math.PI * tireRadius; // Calculate circumference of the tire in inches
        double distanceInInches = circumference * revolutions; // Total distance traveled in inches
        double distanceInMiles = distanceInInches / 63360; // Convert distance from inches to miles
        return distanceInMiles;
    }

    /**
     * Method to calculate the revised fuel economy in miles per gallon.
     * 
     * @param tireRadius       the radius of the tires in inches.
     * @param revolutions      the number of revolutions of the tires.
     * @param gasolineConsumed the amount of gasoline consumed in gallons.
     * @return the fuel efficiency in miles per gallon, rounded to two decimal places.
     */
    public double revisedFuelEconomy(double tireRadius, int revolutions, double gasolineConsumed) {
        double distance = calculateDistanceTraveled(tireRadius, revolutions); // Calculate distance traveled
        return distance / gasolineConsumed; // Calculate miles per gallon
    }
}
