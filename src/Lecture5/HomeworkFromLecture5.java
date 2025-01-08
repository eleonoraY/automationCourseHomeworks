package Lecture5;

import java.util.Random;
import java.util.Scanner;

public class HomeworkFromLecture5 {
    public static void main(String[] args) {

        // firstTask();
        // secondTask();
        // thirdTask();
        // fourthTask();
        // fifthTask();
        //sixthTask();
        seventhTask();
    }

    public static void firstTask() {
        int[] numbers = {2, 3, 115, 12, 113};

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The largest number is: " + max);
    }

    public static void secondTask() {
        int[] list1 = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        for (int i = 1; i < list1.length; i++) {
            if (list1[i] % 5 == 0) {
                System.out.println(list1[i]);
            }
            ;
            if (list1[i] == 150) {
                break;
            }
        }
    }

    public static void thirdTask() {
        int[] list1 = {10, 20, 30, 40, 50};

        for (int i = list1.length - 1; i >= 0; i--) {
            System.out.println(list1[i]);
        }
    }

    public static void fourthTask() {
        int[] numbers = {5, 33, 55, 60, 17, 80, 100};

        for (int num : numbers) {
            if (num % 5 == 0) {
                System.out.println("This is the first number in the array multiple by 5" + num);
                break;
            }
        }
    }

    public static void fifthTask() {
        int[] array = {3, 33, 55, 60, 9, 80, 100};

        for (int i = 1; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                continue;
            }
            System.out.println(array[i]);
        }
    }

    public static void sixthTask() {
        int[] numbers = {55, 20, 80, 250, 33, 162};

        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        int average = sum / numbers.length;

        System.out.println("The average of the list of numbers is equal to: " + average);
    }

    public static void seventhTask() {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
    //    System.out.println("The random number is: " + randomNumber);

        int userNumber = 0;


        do {
            System.out.println("Try to guess the number by entering a value: ");
            userNumber = scanner.nextInt();

            if(userNumber < randomNumber){
                System.out.println("Too low!");
            } else if (userNumber > randomNumber){
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulatons! You guess the random number!");
            }

        } while(randomNumber != userNumber);
    }
}
