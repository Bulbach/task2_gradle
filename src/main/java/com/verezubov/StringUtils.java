package com.verezubov;

public class StringUtils {

    public static boolean isPositiveNumber(String str) {

        int check = Integer.parseInt(str);

        return check > 0;
    }
}
