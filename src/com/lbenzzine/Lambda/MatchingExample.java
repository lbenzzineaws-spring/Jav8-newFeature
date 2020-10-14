package com.lbenzzine.Lambda;

import java.util.HashMap;

public class MatchingExample {

    public static void main(String[] args) {
        HashMap<Integer, String> countries = new HashMap<>();
        countries.put(1, "Canada");
        countries.put(2, "USA");
        countries.put(3, "China");
        countries.put(4, "India");
        countries.put(5, "UK");
        countries.put(6, "Mexico");

        //returns the first three values from the entries in the map
        boolean anyMatch = countries.values().stream()
                .anyMatch(p -> countries.containsValue("USA"));
        System.out.println("Is there any entry for USA in the map : " + anyMatch);

        boolean allMatch = countries.values().stream()
                .anyMatch(p -> countries.containsValue("USA"));
        System.out.println("===========================");
        System.out.println("Is there One or more entry for USA in the map : " + allMatch);

        boolean noneMatch = countries.values().stream()
                .noneMatch(p -> countries.containsValue("Morocco"));
        System.out.println("===========================");
        System.out.println("there is no entry for Morocco in the map : " + noneMatch);

    }
}
