package chapter4;

/*
 * WHILE LOOP:
 * Each store employee makes $15 an hour.
 *  Do not allow overtime.
 */

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String args[]){

        //known variables
        int rate = 15;
        int maxHours = 40;

        //Get input for unknown
        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();


        //Validate input Hoursworked= Sentinel to dont run
        /*
        A sentinel is a variable used within the condition that controls the loop.. It's very important that
        somewhere in your loops there's an opportunity for the sentinel to be
        updated. Otherwise, this loop will run infinitely.
         */
        while (hoursWorked > maxHours || hoursWorked < 1 ){
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();

        //GROSS
        double gross = rate * hoursWorked;
        System.out.println("Gross pay : $ " + gross);
    }
}
