package gross_calculator;

import java.util.Scanner;

/*
Passing Arguments to Methods
Write an 'Instant Credit Check' program that approves anyone who makes more than $25,000 and has a credit score of 700
or better. Reject all others
 */
public class InstantCreditCheck {
    public static void main(String[] args){

        //Get input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double actualSalary = sc.nextDouble();

        System.out.println("Enter your credit score: ");
        int actualCreditScore = sc.nextInt();
        sc.close();

        //Check if the user is qualified
        isUserQualified(actualCreditScore, actualSalary);

    }
    public static void isUserQualified(int creditScore, double salary ){
        double requiredSalary = 25000;
        int requiredCreditScore = 700;

        if (creditScore >= requiredCreditScore && salary >= requiredSalary){
            System.out.println("Congratulations! You have been approved!!.");
        }
        else {
            System.out.println("Insufficient credit score");
        }

    }
}
