package com.verezubov;

public class StringUtil {

    public static boolean isPositiveNumber(String str) {
        try {
            int check = Integer.parseInt(str);
            return check > 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
