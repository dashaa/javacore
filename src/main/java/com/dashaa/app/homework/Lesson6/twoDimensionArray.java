package com.dashaa.app.homework.Lesson6;


public class twoDimensionArray {
    public static void printTwoDimensionArray(){
        int[][] dimensionArray = new int[8][5];
        for(int i=0;i<dimensionArray.length;i++){
            for(int j=0;j<dimensionArray[i].length;j++){
                dimensionArray[i][j]=(int)(Math.random()*90)+10;
                System.out.print(dimensionArray[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
