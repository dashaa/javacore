package com.dashaa.app.classwork.Lesson6;

public class multiDimension {
    public static void main(String[] args){
    int [][] intArray = new int[2][3];
    for(int j=0; j<intArray.length; j++){
        for (int k=0; k<intArray[j].length; k++){
            intArray[j][k] = j*k;
            System.out.println(intArray[j][k]);
        }
    }
}}
