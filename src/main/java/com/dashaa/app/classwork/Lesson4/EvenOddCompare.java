package com.dashaa.app.classwork.Lesson4;

import java.util.Scanner;


public class EvenOddCompare {
    public static void calculate() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please input your value");
                int value = scanner.nextInt();
                if (value % 2 == 0)
                        System.out.println("Value is Even");
                else
                    System.out.println("Value is Odd");

                    }
}
