package com.gmail.valevach.task2;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        char ch = '>';
        System.out.println(ch);


        int i = Integer.MAX_VALUE;
        System.out.println(i);
        int i1 = i+1;
        System.out.println(i1);


        byte num = 23;
        System.out.println(num);
        int num_1 = 34656748;
        System.out.println(num_1);

        float num_2 = 23.45f;
        System.out.println(num_2);
        double num_3 = 234.34553665768797d;
        System.out.println(num_3);

        boolean isTrue = false;
        System.out.println(isTrue);

        char sym = 'R';
        System.out.println(sym);

        Scanner str = new Scanner(System.in);
        System.out.println(str.nextLine());


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Ваше имя:");

        int number = sc.nextInt();


        System.out.println("Ваше имя ");


                System.out.print("Please enter your name: ");
                String name = System.console().readLine();
                System.out.println("Your name is: " + name);



            }
    }








