package gross_calculator;
import java.util.Scanner;
public class GrossPayCalculator {
    public static void main(String[] args) {
        //Get the number of hours worked
        int hours = 0;
        System.out.println("Please enter the hours you would like to pay:");

        Scanner input = new Scanner(System.in);
        hours = input.nextInt();

        //Get the hourly pay rate
        double payRate = 0;
        System.out.println("Please enter the amount you would like to pay:");

        payRate = input.nextDouble();

        input.close();

        //Multiply hours and pay rate
        double grossPay = payRate * hours;

        //Display result
        System.out.println("Gross Pay: " + grossPay);
    }
}
