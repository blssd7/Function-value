package com.gmail.valevach.task1;
//Преобразование секунд в часы, минуты и секунды
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        int seconds;
        int minutes ;
        int hours;
        System.out.print("Enter the number of seconds : ");
        seconds = input.nextInt();
        hours = seconds / 3_600;
        minutes = (seconds%3_600)/60;
        int seconds_output = (seconds% 3_600)%60;


        System.out.println("The time entered in hours,minutes and seconds is:");
        System.out.println(hours  + " hours :" + minutes + " minutes:" + seconds_output +" seconds");
    }

}














