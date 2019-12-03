package chapter3;

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String args[]) {
        //initialize what we know
        int requiredSalary= 30000;
        int requiredYearsEmployed=2;

        //Get what we dont
        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary= scanner.nextDouble();

        System.out.println("Enter the number of years:");
        double years= scanner.nextDouble();

        scanner.close();

        //Make decision
        if(salary >= requiredSalary) {
            if (years >= requiredYearsEmployed) {
                System.out.println("Congrats! You qualify for the loan");
            }
            else{
                System.out.println("Sorry, you must have worked at you current job " + requiredYearsEmployed + "years");
            }
        }
        else {
            System.out.println("Sorry, you must earn at least " + requiredSalary + " dollars to qualify");
        }

    }
}
