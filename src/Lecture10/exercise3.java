package Lecture10;

import java.util.Scanner;

public class exercise3 {
 public static void validateAge(int age) throws IllegalArgumentException{
     if(age < 0 || age > 120){
         throw new IllegalArgumentException("The range should be between 0 and 120.");
     }
 }

 public static void exceptionHandling(int age){
    try{
        validateAge(age);
        System.out.println("Age is valid: " + age);
    }catch (IllegalArgumentException e){
        System.out.println("Error: " + e.getMessage());
    }
 }

    public static void main(String[] args) {
        exceptionHandling(25);
        exceptionHandling(-5);
        exceptionHandling(150);

    }
}


