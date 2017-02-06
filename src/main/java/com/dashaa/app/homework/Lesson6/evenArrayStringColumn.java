package com.dashaa.app.homework.Lesson6;


public class evenArrayStringColumn {
public static void printArrayStringColumn(){
    int[] evenArray = new int[10];

        for (int i = 0, j = 2; i < evenArray.length; i++, j+=2) {
            evenArray[i] = j;
        System.out.print(evenArray[i] + " ");
    }

        for (int i = 0; i < evenArray.length; i++) {
        System.out.print("\n" + evenArray[i]);
    }}
}
