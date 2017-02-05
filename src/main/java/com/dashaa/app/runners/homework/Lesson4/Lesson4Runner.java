package com.dashaa.app.runners.homework.Lesson4;

import com.dashaa.app.classwork.Lesson4.*;
import com.dashaa.app.runners.classwork.Lesson4.*;

import java.util.Scanner;



public class Lesson4Runner {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]) {
        System.out.println("Welcome to programm that would help you:");
        System.out.println("1 - programm compared which of two entered numbers is bigger");
        System.out.println("2 - enter radius and programm will calculate circle area");
        System.out.println("3 - enter radiuses and programm compare circle areas");
        System.out.println("4 - enter number and programm verify is entered number even or odd");
        System.out.println("5 - enter triangle sizes and programm check if triangle is right-angled");
        System.out.println("0 - enter to exit programm");
        int a = scanner.nextInt();

        if (a == 1)
            BiggerOrSmaller.Compare();
        else if (a == 2)
                CircleArea.calculate();
        else if (a == 3)
                    CircleAreaCompare.Compare();
        else if (a == 4)
                    EvenOddCompare.calculate();
        else if (a == 5)
                    TriangleCheck.Calculations();
        else if (a == 0)
                return;
        else
                 System.out.println("Enter one of the numbers from 0 to 5");





    }}