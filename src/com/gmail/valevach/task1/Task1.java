package com.gmail.valevach.task1;
//https://www.mnogoblog.ru/java-urok-4-vvod-chisel-s-klaviatury-system-in

import java.util.Scanner;

public class Task1{
    int a,b,c;
    // Конструктор
    public Task1(int a,int b,int c){
        //присваиваем переменным класса значения
        this.a = a;
        this.b = b;
        this.c = c;
    }
    // функция расчета z
    public double MakeZ (){
        double z = ((a - 3) * b )/2 + c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(z);
        return z;
    }
    public static void main(String[]args) {
        // TODO Auto-generated method stub
        // основная программа, если используем классб то она не вызываетсяю Нужна просто для тестирования
        Scanner sc = new
                Scanner(System.in);
        System.out.println("Введите число a");
        int a = sc.nextInt();
        System.out.println("Введите число b");
        int b = sc.nextInt();
        System.out.println("Введите число с");
        int c = sc.nextInt();
    Task1 ts1 = new Task1(a, b, c);
    double z = ts1.MakeZ();
        System.out.println("Число z = " + z);


    }
}




