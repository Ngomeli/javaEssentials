package gross_calculator;

import java.util.Scanner;
/*
Do While Loop
Write a program that allows a user to enter two numbers and then sums up the two numbers. They should be able to
repeat this action until they indicate they are done.
 */
public class AddNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int runAgain = 0;
        do{
            System.out.print("Enter the first number: ");
            double firstNumber = sc.nextDouble();
            System.out.print("Enter the second number: ");
            double secondNumber = sc.nextDouble();

            double sum = firstNumber + secondNumber;
            System.out.println(firstNumber + " + " + secondNumber + " = " + sum);

            System.out.println("Would you like to start over? Enter 1 for yes or 0 for no.");
            runAgain = sc.nextInt();

        }while(runAgain == 1);
        sc.close();
    }
}
