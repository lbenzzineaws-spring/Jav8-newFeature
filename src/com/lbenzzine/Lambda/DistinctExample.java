package com.lbenzzine.Lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class DistinctExample {

    public static void main(String[] args) {
        HashMap<Integer, String> countries = new HashMap<Integer, String>();
        countries.put(1,"India");
        countries.put(2,"USA");
        countries.put(3,"China");
        countries.put(4,"India");
        countries.put(5,"UK");
        countries.put(6,"China");

        countries.values().stream()
                .distinct()
                .forEach(System.out::println);
    }

}
