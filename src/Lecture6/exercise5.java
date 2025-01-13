package Lecture6.homework;

import java.util.ArrayList;

public class exercise5 {
    public static void main(String[] args) {
        ArrayList<String> todos = new ArrayList<String>();
        todos.add("task1");
        todos.add("task2");
        todos.add("task3");
        todos.add("task4");
        System.out.println("Original list: " + todos);

        todos.set(0, "Completed");
        todos.set(2, "Completed");
        System.out.println("After updating the element at index [0] and index [2]: " + todos);

      //  todos.remove("Completed");
       // todos.remove("Completed");
       // System.out.println("After removing the element with value Completed: " + todos);

        for(int i=0; i< todos.size(); i++){
            todos.remove("Completed");
        }
        System.out.println("After removing the element with value Completed: " + todos);


        System.out.println("Tasks from to-do list are: " + todos);

        }


    }

