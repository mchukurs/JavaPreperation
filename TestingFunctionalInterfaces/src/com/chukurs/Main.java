package com.chukurs;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<Integer> myCharPrinter = (s) -> System.out.println((char) s.intValue());
        for (int i = 32; i < 127; i++) {
            myCharPrinter.accept(i);
        }
    }
}
