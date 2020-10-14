package com.lbenzzine.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

    public static void main(String [] args){

       IntStream stream = IntStream.of(1,2,3,4);

        stream.forEach((n -> System.out.println(n)));
        System.out.println("====================================");
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        Stream<String> stream2 = list.stream();
        //stream2.forEach(e -> System.out.println(e));
        //System.out.println("====================================");
        stream2.forEach(System.out::println);

    }
}
