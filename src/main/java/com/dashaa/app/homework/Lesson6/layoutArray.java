package com.dashaa.app.homework.Lesson6;


public class layoutArray {
    public static void printlayoutArray(){
        int[][] dimensionArray = new int[8][5];
        for(int i=0;i<dimensionArray.length;i++){
            for(int j=0;j<dimensionArray[i].length;j++){
                dimensionArray[i][j]=(int)(Math.random()*10)+1;
                System.out.print(dimensionArray[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
