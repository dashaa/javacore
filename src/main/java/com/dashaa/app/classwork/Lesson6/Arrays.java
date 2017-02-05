package com.dashaa.app.classwork.Lesson6;


public class Arrays {
    public static void booleanArray(){
  boolean [] booleanArray = {true,true,true};
   for (int i=0; i<booleanArray.length; i++)
              System.out.println(booleanArray[i]);
}

    public static void charArray(){

        String[] charArray = {"a","b","c"};
        for (int i=0; i<charArray.length; i++)
            System.out.println(charArray[i]);
    }
        public static void doubleArray(){

        double[] doubleArray = {3.14, 2.71, 0};
        for (int i=0; i<doubleArray.length; i++)
            System.out.println(doubleArray[i]);
    }
    public static void longArray(){

        long[] longArray = {100000L, -200000L, 0L};
        for (int i=0; i<longArray.length; i++)
            System.out.println(longArray[i]);
    }
}
