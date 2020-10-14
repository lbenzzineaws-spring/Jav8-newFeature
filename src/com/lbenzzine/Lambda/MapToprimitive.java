package com.lbenzzine.Lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class MapToprimitive {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Tomorrow");
        words.add("is");
        words.add("another");
        words.add("day");

        Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>(words.size());
        words.stream().mapToInt(word -> word.length())
                      .forEach( System.out::println);
    }
}
