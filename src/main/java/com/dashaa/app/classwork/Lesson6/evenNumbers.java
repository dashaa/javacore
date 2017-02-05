package com.dashaa.app.classwork.Lesson6;


public class evenNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int kol = 0;
        for (int i=0; i<= 20; i++){
            if ((i%2)==0){
                ++sum;
                kol +=i;
            }
        }
        System.out.println("summa: " +sum);
        System.out.println("kolichestvo: " +kol);
    }
}
