package Lecture6.homework;

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int array[][] = new int[rows][columns];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print("Element [" + i + "][" + j + "]");
                array[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j<columns; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
