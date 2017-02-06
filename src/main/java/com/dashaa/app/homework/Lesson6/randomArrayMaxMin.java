package com.dashaa.app.homework.Lesson6;


import java.util.Random;

public class randomArrayMaxMin {
    public static void printRandomArrayMaxMin(){
        int  maximum;
        int  minimum;
        int b=0;
        int[] randomArray = new int[15];
        for(int i=0;i<randomArray.length;i++){
            Random r=new Random();
            randomArray[i]=r.nextInt(1000);
            System.out.print(randomArray[i] +" ");

}
        maximum = randomArray[0];
        minimum = randomArray[0];
        for(int in: randomArray){
            if(in>maximum) maximum=in;
            if(in<minimum) minimum=in;
        }

        System.out.print("\n maximum value: " + maximum +"\n minimum value: "+ minimum);
    }}
