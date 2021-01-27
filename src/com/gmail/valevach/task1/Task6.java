package com.gmail.valevach.task1;
//Составляем линейную программу для заданной области
    import java.util.Scanner;
    public class Task6{
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double x = scan.nextDouble();
            double y = scan.nextDouble();
            if (y < 2 - x * x && y > x && x >=0)
                System.out.println("YES");
            else{
                if (y < 2 - x * x && y > x && x < 0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }

        }
    }


