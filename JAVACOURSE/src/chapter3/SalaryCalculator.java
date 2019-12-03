package chapter3;
import java.util.Scanner;
/*
Payment= $1000
exceed 10 sales= bonus $250 if
 */
public class SalaryCalculator {
    public static void main (String args[]){
        //Initialize know values
        int salary= 1000;
        int bonus= 250;
        int quota= 10;

        //get values for the unknown
        System.out.println("HOW MANU SALES DID THE EMPLOYEE? ");
        Scanner scanner = new Scanner(System.in);
        int sales= scanner.nextInt();
        scanner.close();

        //Quick detour for de bonus earners
        if (sales > quota ){
            salary= salary + bonus;
        }
        //Output
        System.out.println("The employee's pay is $" + salary);

    }
}
