package com.dashaa.app.classwork.Lesson6;


public class evenNumbers {
    public static void countEvenNumbers() {
        int sum = 0;

        for (int i=0; i<= 20; i++){
            if ((i%2)==0){
                ++sum;

            }
        }
        System.out.println("summa: " +sum);

    }
}
