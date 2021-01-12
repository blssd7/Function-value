package com.gmail.valevach.task1;
// https://javarush.ru/groups/posts/2762-klass-java-math-i-ego-metodih
// Извлечение корней возведение в степень
    import java.util.Scanner;
    import java.lang.Math;

    public class Task2 {
        Double a, b, c;

        // Конструктор
        public Task2(Double a, Double b, Double c) {
            //присваиваем переменным класса значения
            this.a = a;
            this.b = b;
            this.c = c;
        }

        // Формула расчетa d
        public double MakeD() {
            double d = (b + Math.sqrt((b * b + 4 * a * c))) / (2 * a) - a * a * a * c + Math.pow(b, -2);
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            return d;
        }

        public static void main(String[] args) {
            //TODO Auto-generated method stub
            Scanner sc = new
                    Scanner(System.in);
            System.out.println("Введите число a");
            Double a = sc.nextDouble();
            System.out.println("Введите число b");
            Double b = sc.nextDouble();
            System.out.println("Введите число с");
            Double c = sc.nextDouble();
            Task2 ts2 = new Task2(a, b, c);
            double d = ts2.MakeD();
            System.out.println("Число d = " + d);
        }
    }





    
