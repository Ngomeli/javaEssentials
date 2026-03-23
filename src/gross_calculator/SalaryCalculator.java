package gross_calculator;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        //initialize known values
        int quota = 10;

        //Get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner input = new Scanner(System.in);
        int sales = input.nextInt();
        input.close();

        //quick detour for the bonus earners
        if (sales >= quota) {
            System.out.println("Congrats!! You have met your quota!.");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("You have " + salesShort + " sales left.");
        }

        //output

    }
}
