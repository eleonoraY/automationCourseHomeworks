package Lecture6.homework;

import java.util.LinkedList;
import java.util.Scanner;

public class exercise7 {
        public static void main(String[] args) {
            LinkedList<String> contacts = new LinkedList<>();
            Scanner scanner = new Scanner(System.in);

            boolean running = true;
            while (running) {
                System.out.println("Меню:");
                System.out.println("1. Добавяне на контакт");
                System.out.println("2. Показване на всички контакти");
                System.out.println("3. Премахване на контакт");
                System.out.println("4. Изход");
                System.out.print("Изберете опция: ");

                int choice = scanner.nextInt();
                scanner.nextLine();  // Изчистване на новия ред

                switch (choice) {
                    case 1:  // Добавяне на контакт
                        System.out.print("Въведете име на контакт: ");
                        String contact = scanner.nextLine();
                        contacts.add(contact);
                        System.out.println("Контактът е добавен.");
                        break;
                    case 2:  // Показване на всички контакти
                        if (contacts.isEmpty()) {
                            System.out.println("Няма добавени контакти.");
                        } else {
                            System.out.println("Списък с контакти:");
                            for (String c : contacts) {
                                System.out.println("- " + c);
                            }
                        }
                        break;
                    case 3:  // Премахване на контакт
                        if (contacts.isEmpty()) {
                            System.out.println("Списъкът е празен.");
                        } else {
                            System.out.print("Въведете име на контакт за премахване: ");
                            String removeContact = scanner.nextLine();
                            if (contacts.remove(removeContact)) {
                                System.out.println("Контактът е премахнат.");
                            } else {
                                System.out.println("Контактът не беше намерен.");
                            }
                        }
                        break;
                    case 4:  // Изход
                        running = false;
                        break;
                    default:
                        System.out.println("Невалидна опция. Опитайте отново.");
                }
            }
            scanner.close();
        }
    }

