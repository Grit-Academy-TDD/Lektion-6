package org.example;

import java.util.Scanner;

public class Main {
    public static String name;
    public static String age;
    public static boolean isAdult = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        name = scanner.nextLine();
        System.out.println("Enter your last name: ");
        name += " " + scanner.nextLine();
        System.out.println(name);
    }

    public static void getUserAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = scanner.nextLine();
        try {
            isAdult = Integer.parseInt(age) >= 18;
        } catch (NumberFormatException numberFormatException) {
            isAdult = false;
            throw new NumberFormatException();
        }
    }
}