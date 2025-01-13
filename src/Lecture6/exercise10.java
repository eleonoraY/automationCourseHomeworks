package Lecture6.homework;

import java.util.Stack;

public class exercise10 {
    public static void main(String[] args) {
        Stack<String> books = new Stack<String>();

        books.push("Harry Potter");
        books.push("The Great Gatsby");
        books.push("The Lord of the Rings");
        books.push("Frankenstein");
        books.push("To Kill a Mockingbird");

        String wantedBook = "Harry Potter";
        int position = books.search(wantedBook);

        if(position != -1){
            System.out.println("The book you are looking for is " + wantedBook + " at position [" + position + "].");
        }else {
            System.out.println("The book " + wantedBook + " is not found.");
        }

        System.out.println("Current books in the stack: " + books);





    }
}
