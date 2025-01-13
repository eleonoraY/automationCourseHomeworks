package Lecture6.homework;

import java.util.LinkedList;
import java.util.Queue;

public class exercise8 {
    public static void main(String[] args) {
        Queue<String> customers = new LinkedList<String>();

        customers.add("Ivan");
        customers.add("Mitko");
        customers.add("Stefan");

        System.out.print("The initial queue list is: ");
        System.out.println(customers);

        customers.add("Maria");
        System.out.print("The queue list after involving new customer is: ");
        System.out.println(customers);


        customers.poll();
        System.out.print("The queue list after serving one customer is: ");
        System.out.println(customers);


    }
}
