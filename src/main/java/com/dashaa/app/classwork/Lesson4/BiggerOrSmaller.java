package com.dashaa.app.classwork.Lesson4;

import java.util.Scanner;


public class BiggerOrSmaller {
    public static void Compare(){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Type value 1 ");
                int value1 = scanner.nextInt();
                System.out.println("Type value 2 ");
                int value2 = scanner.nextInt();
                if (value1 > value2)
                        System.out.println("value 1 is bigger");
                else if (value1 < value2)
                            System.out.println("value 2 is bigger");
                else
                System.out.println("Value 1 and 2 are equals");
            }
}
