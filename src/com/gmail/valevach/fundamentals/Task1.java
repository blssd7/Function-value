package com.gmail.valevach.fundamentals;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println("Hello" + " " + line);

        }
    }
}


