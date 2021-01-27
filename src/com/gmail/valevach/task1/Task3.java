package com.gmail.valevach.task1;
// Нахождение косинусов, синусов, тангенсов углов

    import java.util.Scanner;
    import java.lang.Math;

    public class Task3 {
        Double x,y;
        //Конструктор
        public Task3 (Double x,Double y) {
            //присваиваем переменным класса значения
            this.x = x;
            this.y = y;
        }
        // Функция расчета z
        public double MakeZ() {
            double z = (Math.sin(x) + Math.cos(y) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y));
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
            return z;
        }
            public static void main(String[]args) {
            //TODO Auto-generated method stub
        Scanner sc = new
                Scanner(System.in);
                System.out.println("Введите число x");
                Double x = sc.nextDouble();
                System.out.println("Введите число y");
                Double y = sc.nextDouble();
                Task3 ts3 = new Task3(x,y);
                double z = ts3.MakeZ();
                System.out.println("Число z =" + z);

    }
}
