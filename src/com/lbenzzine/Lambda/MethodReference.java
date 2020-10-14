package com.lbenzzine.Lambda;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {
    //Non Static Method
    public int getLength(String str){
        return str.length();
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("done");
        list.add("word");
        list.add("practice");
        list.add("fake");
        MethodReference reference = new MethodReference();
        // Code without using method reference.
        list.stream()
                .mapToInt(str -> reference.getLength(str))
                .forEach(str -> System.out.println(str));
        System.out.println("==================== same output");
        // Code with method reference.
        list.stream()
                .mapToInt(reference::getLength)
                .forEach(System.out::println);
    }
}
