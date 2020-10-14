package com.lbenzzine;

    public class FirstLambda {

        public static void wish(Greeting greeting) {
            greeting.greet();
        }

        // Passing a lambda expression to wish method.
        public static void main(String args[]) {
            wish( () -> System.out.println("Namaste"));
            wish( () -> System.out.println("Good Morning"));
        }
    }

