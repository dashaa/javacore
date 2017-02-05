package com.dashaa.app.classwork.Lesson4;

import java.util.Scanner;

import static java.lang.Math.PI;


public class CircleArea {

    public static void calculate (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter radius: " );
        double radius = scanner.nextDouble();
        double circleArea = PI * radius * radius;
        System.out.println("Area is " + circleArea);
    }
}
