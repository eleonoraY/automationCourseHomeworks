package Lecture6.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lotteryNumbers = new ArrayList<Integer>();

       boolean running = true;
       while(running){
           System.out.println("Menu:");
           System.out.println("1. Add lottery number");
           System.out.println("2. Show all lottery numbers");
           System.out.println("3. Check for a winning number");
           System.out.println("4. Exit");
           System.out.println("Choose an option: ");

           int choice = scanner.nextInt();

           switch (choice){
               case 1:
                   System.out.println("Insert number: ");
                   int number = scanner.nextInt();
                   if(!lotteryNumbers.contains(number)) {
                       lotteryNumbers.add(number);
                       System.out.println("The number is added.");
                   }else {
                       System.out.println("The number is not added.");
                   }
                   break;
               case 2:
                   System.out.println("The lottery numbers are: " + lotteryNumbers);
                   break;
               case 3:
                   System.out.println("Insert a number for check: ");
                   int checknumber = scanner.nextInt();
                   if(lotteryNumbers.contains(checknumber)){
                       System.out.println("The number " + checknumber + " is winnable.");
                   }else {
                       System.out.println("The number " + checknumber + " is not winnable.");
                   }
                   break;
               case 4:
                   running = false;
                   break;
               default:
                   System.out.println("Invalid option. Try again.");
           }
       }
    }
}
