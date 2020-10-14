package com.lbenzzine;


import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<String> stringConsumer = s -> System.out.println(s);
        stringConsumer.accept("Hello World.");

        Consumer<Integer> intConsumer = i -> System.out.println("Integer value = " + i);
        intConsumer.accept(5);
    }
}