package Lecture10;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        boolean validInput = false;

        while(!validInput) {
        System.out.println("Enter an integer: ");
        try{
            userInput = Integer.parseInt(scanner.nextLine());
            validInput = true;
        }catch(NumberFormatException e){
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        }
        System.out.println("You entered: " + userInput);
    }
}
