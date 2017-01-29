package com.dashaa.app.classwork.Lesson3;


public class MathFunc {
    public int multiply (int a, int b)
    {
        return a*b;
    }
    public int compareNum (int a, int b) {
                    if (a>=b){
                            return a;
                        } else {
                            return b;
                        }
}
    public int addNum (int a, int b) {
                   return a+b;
               }
       public static int divideNum (int a, int b) {
                   return a/b;
               }
    public static int divideNum2 (int c, int d) {
        return c/d;
    }
    public int substractNum (int a, int b) {
                  return a-b;
    }
    public boolean checkIfEqual (int a, int b) {
                   if (a == b) {
                            return true;
                        } else {
                            return false;
                        }
}
    public static int factorialRes(int a, int b, int c, int d) {
        return a*b*c*d;
    }
    public static String sentenceCreation(String a, String b, String c) {
        return a+" "+b+" "+c;
    }
}
