package com.lbenzzine;


import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorExample {


    public static void main(String args[]) {
        IntUnaryOperator powerOfTwo = num -> num * num;

        System.out.println(powerOfTwo.applyAsInt(25));
    }
}