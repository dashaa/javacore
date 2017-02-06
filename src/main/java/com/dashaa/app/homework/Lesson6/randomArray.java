package com.dashaa.app.homework.Lesson6;


import java.util.Random;

public class randomArray {
    public static void printRandomArray(){
    int b=0;
    int[] randomArray = new int[15];
        for(int i=0;i<randomArray.length;i++){
        Random r=new Random();
            randomArray[i]=r.nextInt(10);
        System.out.print(randomArray[i] +" ");
        if(randomArray[i]>0&randomArray[i]%2==0)b++;
    }

        System.out.println("\n"+ "Even sum " +b);
}
}
