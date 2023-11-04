package com.chukurs;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        // testingConsumer();
        testingBiConsumer();
    }


    public static void testingConsumer() {
        Consumer<Integer> myCharPrinter = (s) -> System.out.println((char) s.intValue());
        for (int i = 32; i < 127; i++) {
            myCharPrinter.accept(i);
        }
    }

    public static void testingBiConsumer() {
        BiConsumer<Integer, Character> myIntToChar = (x, y) -> {
            System.out.println(x + " as character is " + (char) x.intValue());
            System.out.println(y + " as integer is " + (int) y);
        };
        for (int i = 32; i < 127; i++) {
            myIntToChar.accept(i, (char) (i + 1));
        }
    }
}
