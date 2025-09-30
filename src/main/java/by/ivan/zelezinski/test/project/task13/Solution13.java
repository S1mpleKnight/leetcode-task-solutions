package by.ivan.zelezinski.test.project.task13;

import java.util.HashMap;

public class Solution13 {

    private static final String[] LITERALS = {
      "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    };

    private static final int[] VALUES = {
            1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
    };

    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < LITERALS.length && !s.isEmpty(); i++) {
            while (s.startsWith(LITERALS[i])) {
                result += VALUES[i];
                s= s.replaceFirst(LITERALS[i], "");
            }
        }
        return result;
    }
}
