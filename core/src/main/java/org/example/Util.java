package org.example;


import com.verezubov.StringUtil;

public class Util {

    public static boolean isAllPositiveNumbers(String... str) {
        for (String item : str) {
            if (!StringUtil.isPositiveNumber(item)) {
                return false;
            }
        }
        return true;
    }

}
