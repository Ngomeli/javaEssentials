package gross_calculator;

import java.util.Scanner;
/*
While loop
Each store employee makes $15 USD an hour. Write a program that allows the employee to enter the number of hours
worked for the week. Do not allow overtime.
 */
public class GrossPayInputValidator {
    public static void main (String [] args){
        //Initialize known variables
        int PayRate = 15;
        int maxHours = 40;

        //Get input for unknown variables
        System.out.println("How many hours did you work this week?");
        Scanner sc = new Scanner(System.in);
        double hoursWorked = sc.nextDouble();

        //Validate input
        while(hoursWorked > maxHours){
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again.");
            hoursWorked = sc.nextInt();
        }

        sc.close();

        //Calculate gross
        double gross = PayRate * hoursWorked;
        System.out.println("Gross Pay: $" + gross);
    }
}
