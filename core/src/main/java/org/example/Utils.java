package org.example;


import com.verezubov.StringUtils;

public class Utils {

    public static boolean isAllPositiveNumbers(String... str) {
        for (String item : str) {
            if (!StringUtils.isPositiveNumber(item)) {
                return false;
            }
        }
        return true;
    }

}
