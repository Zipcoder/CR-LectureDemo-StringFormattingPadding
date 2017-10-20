package com.zipcodewilmington.stringformat_demo;

/**
 * Created by leon on 10/20/17.
 */
public class Main {
    public static void main(String[] args) {
        String string = "Hello World";
        int padding = 20;

        String paddedLeftString = StringUtils.padLeft(string, padding);
        String paddedRightString = StringUtils.padRight(string, padding);

        String concatenatedStrings = paddedRightString + paddedLeftString;

        System.out.println(paddedLeftString);
        System.out.println(paddedRightString);
        System.out.println(concatenatedStrings);
    }
}
