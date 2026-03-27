package gross_calculator;
import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        String grade = input.nextLine();
        input.close();

        String message;
        switch (grade) {
            case "A":
                message = "Excellent Job!";
                break;
            case "B":
                message = "Great Job!";
                break;
            case "C":
                message = "Good Job!";
                break;
            case "D":
                message = "You need to work a bit harder!";
                break;
            case "F":
                message = "Uh oh! Sit down and read!";
                break;
            default:
                message = "Invalid grade!";
                break;
        };
        System.out.println(message);
    }
}
