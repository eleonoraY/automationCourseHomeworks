package Lecture6.homework;

import java.util.Stack;

public class exercise9 {
    public static void main(String[] args) {
        Stack<String> books = new Stack<>();

        books.push("Harry Potter");
        books.push("The Great Gatsby");
        books.push("The Lord of the Rings");
        books.push("Frankenstein");

        System.out.println("List of books: " + books);
        System.out.println("The top book is: " + books.peek());

        books.pop();
        System.out.println("List of books after removing one book: " + books);
    }
}
