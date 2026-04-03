package text_processing;

import java.util.Scanner;

public class TextProcessor {

    public static void  main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter room number");
        int roomNumber = input.nextInt();
        input.nextLine(); // ✅ consume leftover newline

        System.out.println("Enter room name");
        String roomName = input.nextLine(); // ✅ allows spaces

        System.out.println("Enter room description");
        String roomDescription = input.nextLine(); // ✅ allows spaces

        System.out.println("Enter room price");
        double roomPrice = input.nextDouble();

        System.out.println("Enter room area");
        while (!input.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number:");
            input.next(); // discard invalid input
        }
        double roomArea = input.nextDouble();

        // Print to confirm
        System.out.println("\n--- Room Details ---");
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Name: " + roomName);
        System.out.println("Description: " + roomDescription);
        System.out.println("Price: " + roomPrice);
        System.out.println("Area: " + roomArea);
    }
}