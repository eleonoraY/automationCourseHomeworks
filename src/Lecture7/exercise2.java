package Lecture7;

import java.util.HashSet;

public class exercise2 {
    public static void main(String[] args) {
        HashSet<String> guestlist = new HashSet<>();
        guestlist.add("Ivan");
        guestlist.add("Maria");
        guestlist.add("Gosho");
        guestlist.add("Ani");

        System.out.println("Show the guests list: " + guestlist);

        guestlist.add("Ivan");
        System.out.println("Show the guests list after adding duplicate guest: " + guestlist);

        guestlist.remove("Maria");
        System.out.println("Show the guests after removing Maria from the list: " + guestlist);

        System.out.println("Is Maria included in the guest list? " + guestlist.contains("Maria"));
        System.out.println("Print all the guest names to see who is attending: " + guestlist);

    }
}
