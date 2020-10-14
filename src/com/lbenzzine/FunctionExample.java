package com.lbenzzine;

    import java.util.Arrays;
    import java.util.function.Function;

    public class FunctionExample {

        public static void main(String[] args) {
            // Created a function which returns the length of string.
            String [] input = new String[] {"this", "is", "an", "array", "of", "strings"};
            Function<String, Integer> lengthFunction = str -> str.length();
            int [] lengths = new int[input.length];
            for (int i = 0 ; i < input.length; i++) {
                lengths[i] = lengthFunction.apply(input[i]);
            }
            System.out.println("Length of each of the elements of the input array: " + Arrays.toString(lengths));

        }
    }

