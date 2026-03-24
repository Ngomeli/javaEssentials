package gross_calculator;

import java.io.PrintStream;
import java.util.Scanner;

public class TestResults {
    public static void main(String[] args) {
        // Get the test score
        System.out.println("Enter your test score:");
        Scanner input = new Scanner(System.in);
        double score = input.nextDouble();
        input.close();

        // Determine the letter grade
        char grade;
        if (score < 60) {
            grade = 'F';
        } else if (score < 70) {
            grade = 'D';
        } else if (score < 80) {
            grade = 'C';
        } else if (score < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }

        // Print score and grade
        System.out.printf("Your test score is %.2f and your grade is %c\n", score, grade);
    }
}