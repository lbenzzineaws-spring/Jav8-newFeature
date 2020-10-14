package com.lbenzzine;

import java.util.function.IntSupplier;

    public class SupplierExample {

        public static void main(String args[]) {

            IntSupplier supplier = () -> (int)(Math.random() * 10);

            System.out.println(supplier.getAsInt());
        }
    }

