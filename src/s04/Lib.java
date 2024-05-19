/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s04;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lib {

    /**
     *
     * @param msg the message to prompt the user for input.
     * @param errMsg the error message to display when the input is invalid.
     * @return the positive integer input by the user.
     */
    public static int GetPositiveInteger(String msg, String errMsg) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.print(msg);  //// Display the prompt message
                n = Integer.parseInt(sc.nextLine()); //read and convert input to integer
                if (n <= 0) { //check if input is not Positive integer
                    throw new Exception(errMsg);

                }
                return n;

            } catch (Exception e) { //catch any exceptions, print invalid input
                System.out.println(errMsg);
            }

        } while (true); //continue loop until a valid input
    }
    
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
}
