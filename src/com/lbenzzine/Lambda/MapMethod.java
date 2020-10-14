package com.lbenzzine.Lambda;

import java.util.ArrayList;
import java.util.List;

public class MapMethod {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        // let's add some random numbers and filter the even resulting numbers
        System.out.println("================ the stream of numbers is ");
        for (int i = 0 ; i < 5 ; i++){
            numbers.add((int) (Math.random() * 100));
            System.out.println(numbers.get(i));
        }
        System.out.println("================ the stream after mapping ");
        numbers.stream().map( n -> n * n)
                .forEach(System.out::println);
    }
}

