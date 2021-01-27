package com.gmail.valevach.task1;
// Меняем меcтами целую и дробную части числа

import java.util.Scanner;
import java.lang.Math;

public class Task4 {
 Double R;

// Конструктор

 public Task4(Double R) {
  // Присваиваем переменной класса значение
  this.R = R;
 }
 // Формула расчета
 public double MakeD(){
  double x = R;
  double y = (int) x;
  double d = R / 1000 + (R - y) * 1000;
  System.out.println(d);
  return d;
 }
 public static void main(String[] args) {
  //TODO Auto-generated method stub
  Scanner sc = new
          Scanner(System.in);
  System.out.println("Введите число nnn,ddd");
  Double R = sc.nextDouble();
  Task4 ts4 = new Task4(R);
  double d = ts4.MakeD();
  System.out.println("Число d = " + d);
 }
}





