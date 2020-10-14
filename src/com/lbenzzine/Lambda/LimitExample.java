package com.lbenzzine.Lambda;

import java.util.HashMap;

public class LimitExample {

    public static void main(String[] args) {
        HashMap<Integer, String> countries = new HashMap<>();
        countries.put(1, "Canada");
        countries.put(2, "USA");
        countries.put(3, "China");
        countries.put(4, "India");
        countries.put(5, "UK");
        countries.put(6, "Mexico");

        //returns the first three values from the entries in the map
        countries.values().stream()
                .limit(3)
                .forEach(System.out::println);
    }
}
