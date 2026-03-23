package gross_calculator;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        //initialize known values
        int salary = 10000;
        int bonus = 2500;
        int quota = 10;

        //Get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner input = new Scanner(System.in);
        int sales = input.nextInt();
        input.close();

        //quick detour for the bonus earners
        if (sales > quota) {
            salary = salary + bonus;

        }
        //output
        System.out.println("The employee salary is: " + salary);
    }
}
