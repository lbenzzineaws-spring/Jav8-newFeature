package com.lbenzzine;


import java.util.function.UnaryOperator;

public class CapturingLambdaDemo {

    public static void main(String [] args){

        int i = 5;
        //i = 7;
        UnaryOperator<Integer> operator = (input) -> input * i;

        System.out.println(operator.apply(i));

    }
}
