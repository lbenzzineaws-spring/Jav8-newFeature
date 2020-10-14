package com.lbenzzine.Lambda;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        // let's add some random numbers and filter the even resulting numbers
        System.out.println("================ the stream of numbers is ");
        for (int i = 0 ; i < 5 ; i++){
            numbers.add((int) (Math.random() * 100));
            System.out.println(numbers.get(i));
        }
        System.out.println("================ the stream of even numbers is ");
        numbers.stream().filter( n -> n != 0 && n % 2 == 0)
                        .filter(n -> n < 20)
                        .forEach(System.out::println);
    }
}
