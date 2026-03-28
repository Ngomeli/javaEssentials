package gross_calculator;

import java.util.Scanner;
/*
Nested Loops:
Find the average of each student's test scores
 */
public class AverageTestScores {
    public static void main(String[] args) {
        //Initialize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;

        Scanner sc = new Scanner(System.in);

        //Process all students
        for(int i = 0; i < numberOfStudents; i++){
            double total = 0;

            //Process a Student's test scores
            for(int j = 0; j < numberOfTests; j++){
                System.out.print("Enter the score for Test " + (j+1) + ": ");
                double score = sc.nextDouble();
                total += score;
            }
            double average = total/numberOfTests;
            System.out.println("The average score for the student is " + average);
        }
        sc.close();
    }
}
