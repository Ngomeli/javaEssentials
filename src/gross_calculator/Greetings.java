package gross_calculator;

import java.util.Scanner;
public class Greetings {
    public static void main(String[] args) {
        greetUser();

    }
    public static void greetUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hi there," + name);
    }
}

