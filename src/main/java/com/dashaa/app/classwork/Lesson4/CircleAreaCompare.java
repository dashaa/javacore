package com.dashaa.app.classwork.Lesson4;

import java.util.Scanner;

/**
 * Created by Кики on 29.01.2017.
 */
public class CircleAreaCompare {

    public static final double PI = 3.14d;

            public static void Compare(){
                Scanner scanner = new Scanner(System.in);
                        System.out.println("Compare: this prog compares areas of two circles");

                        System.out.println("please input first radius");
                double radius1 = scanner.nextDouble();

                        System.out.println("please input second radius");
                double radius2 = scanner.nextDouble();

                        double area1 = PI * Math.pow(radius1, 2);
                double area2 = PI * Math.pow(radius2, 2);

                        if (area1 > area2)
                        System.out.println("Area1 is bigger");
                else
                    System.out.println("Area2 is bigger");
            }
}

