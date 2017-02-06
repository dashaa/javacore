package com.dashaa.app.homework.Lesson6;


public class oddArray {
    public static void printOddArray(){
    int a=0;
    int[] oddArray = new int[50];
        for(int i=1;i<=99;i++) {
            if (i % 2 != 0) a++;
        }

        for(int i=1,j=0;i<=99;i++){
        if(i%2!=0){
            oddArray[j]=i;
            System.out.print(oddArray[j]+" ");
            j++;
        }
    }
    System.out.println(" ");
        for(int i=oddArray.length-1;i>=0;i--){
        System.out.println(oddArray[i]);
    }
}}
