package Lecture10;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class exercise2 {
    public static void main(String[] args) {
        String filePath = "src/Lecture10/input.txt"; // Path to the file

        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            if (scanner.hasNextLine()) {
                String content = scanner.nextLine();
                try {
                    int number = Integer.parseInt(content);
                    double squareRoot = Math.sqrt(number);
                    System.out.println("The square root of " + number + " is " + squareRoot);
                } catch (NumberFormatException e) {
                    System.out.println("Error: The content of the file is not a valid integer.");
                }
            } else {
                System.out.println("Error: The file is empty.");
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file was not found at path: " + filePath);
        }
    }
}
