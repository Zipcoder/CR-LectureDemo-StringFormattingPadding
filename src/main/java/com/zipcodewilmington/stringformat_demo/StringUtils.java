package com.zipcodewilmington.stringformat_demo;

/**
 * Created by leon on 10/20/17.
 */
public class StringUtils {
    public static String padLeft(String s, int n) {
        return String.format("%1$" + n + "s", s);
    }

    public static String padRight(String s, int n) {
        return padLeft(s, -n);
    }
}
