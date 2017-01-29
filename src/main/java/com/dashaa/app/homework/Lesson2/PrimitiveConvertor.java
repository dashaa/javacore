package com.dashaa.app.homework.Lesson2;

/**
 * Created by Кики on 22.01.2017.
 */
public class PrimitiveConvertor {
    public float floatVariable = 12.3f;
    public char charVariable;
    public int intVariable = 65;
    public void floatToChar () {
        charVariable = (char) floatVariable;
        System.out.println("Input float value is: " + floatVariable + ". Output char value is: " + charVariable);
    }
    public void intToChar (){
        charVariable = (char) intVariable;
        System.out.println("Input int value is: " + intVariable + ". Output char value is: " + charVariable);
    }
    public void charToInt () {
        intVariable = (int) charVariable;
        System.out.println("Input char value is: " + charVariable + ". Output int value is: " + intVariable);
    }
    }

