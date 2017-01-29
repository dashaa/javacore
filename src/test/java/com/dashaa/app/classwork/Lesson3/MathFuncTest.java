package com.dashaa.app.classwork.Lesson3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class MathFuncTest {
    @Test
    public void multiply() {
MathFunc mathFunc = new MathFunc();

        Assert.assertEquals(6,mathFunc.multiply(2,3));
    }
    @Test
    public void compareGraterFirst()  {
                MathFunc mathFunc = new MathFunc();
               Assert.assertEquals(2,mathFunc.compareNum(2,1));
            }
    @Test
    public void compareGraterSecond() {
                MathFunc mathFunc = new MathFunc();
                Assert.assertEquals(3, mathFunc.compareNum(2,3));
            }
    @Test
    public void compareSame()  {
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(2,mathFunc.compareNum(2,2));
    }
    @Test
    public void addNum () {
                MathFunc mathFunc = new MathFunc();
                Assert.assertEquals(5, mathFunc.addNum(2, 3));
            }
    @Test
    public void addNumNegative () {
        MathFunc mathFunc = new MathFunc();
        Assert.assertNotEquals(8, mathFunc.addNum(2, 3));
    }
    @Test
    public void divideNum () {
        Assert.assertEquals(3, MathFunc.divideNum(9, 3));}
    @Test
    public void divideNum2 () {
        Assert.assertNotEquals(4, MathFunc.divideNum2(9, 3));
    }
    @Test
    public void substractNumMinus () {
        MathFunc mathFunc = new MathFunc();
                Assert.assertEquals(-2, mathFunc.substractNum(5, 7));
            }
    @Test
    public void substractNumPlus () {
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals(2, mathFunc.substractNum(7, 5));
    }
    @Test
    public void substractNumNegative () {
        MathFunc mathFunc = new MathFunc();
        Assert.assertNotEquals(5, mathFunc.substractNum(7, 5));
    }
    @Test
    public void checkIfEqualTrue () {
               MathFunc mathFunc = new MathFunc();
                int a = 10;
               int b = 10;
                Assert.assertEquals(true, mathFunc.checkIfEqual(a,b));
            }
    @Test
    public void checkIfEqualFalse () {
                MathFunc mathFunc = new MathFunc();
               int a = 5;
               int b = 4;
               Assert.assertEquals(false, mathFunc.checkIfEqual(a,b));
           }
    @Test
    public void checkIfEqualTrueCalculating () {
        MathFunc mathFunc = new MathFunc();
        int a = 5*5-5;
        int b = 7*2+6;
        Assert.assertEquals(true, mathFunc.checkIfEqual(a,b));
    }
    @Test
    public void checkIfEqualFalseCalculating () {
        MathFunc mathFunc = new MathFunc();
        int a = 2*2+4;
        int b = 9;
        Assert.assertEquals(false, mathFunc.checkIfEqual(a,b));
    }
    @Test
    public void factorialCheck(){
        MathFunc mathFunc = new MathFunc();;
        Assert.assertEquals(24, mathFunc.factorialRes(1,2,3,4));
            }
    @Test
    public void factorial_no_equals(){
        MathFunc mathFunc = new MathFunc();
        Assert.assertNotEquals(12, mathFunc.factorialRes(1,2,3,4));
            }
    @Test
    public void sentenceConstructorPositiveCheck(){
        MathFunc mathFunc = new MathFunc();
        Assert.assertEquals("How a u", mathFunc.sentenceCreation("How","a", "u"));
            }
    @Test
    public void sentenceConstructorNegativeCheck(){

        MathFunc mathFunc = new MathFunc();
        Assert.assertNotEquals("Iamtired", mathFunc.sentenceCreation("I","am", "tired"));
            }
    @Test
    public void sentenceConstructorNegativeCheck2(){

        MathFunc mathFunc = new MathFunc();
        Assert.assertNotEquals("La la lend", mathFunc.sentenceCreation("I","am", "tired"));
    }
}