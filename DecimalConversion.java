package com.dubey.leetcode;

import java.util.HashMap;
import java.util.Map;

public class DecimalConversion {
    public static void main(String[] args) {
        System.out.println(fractionRepresentation(1, 2) + " " + fractionRepresentation(1, 3) + " " + fractionRepresentation(6, 11));
        if (fractionRepresentation(1, 2).equals("0.5") && fractionRepresentation(6, 11).equals("0.(54)") && fractionRepresentation(1, 3).equals("0.(3)")) {
            System.out.println("All passed");
        } else {
            System.out.println("Failed");
        }
    }

    private static String fractionRepresentation(int num, int den) {
        if (num == 0) return "0";
        if (den == 0) return "";
        StringBuilder sb = new StringBuilder();
        if ((num < 0) ^ (den < 0)) sb.append("-");
        num = Math.abs(num);
        den = Math.abs(den);
        int quotient = num / den;
        int remainder = num % den * 10;
        sb.append(quotient);
        if (remainder == 0) {
            return sb.toString();
        }
        sb.append(".");
        Map<Integer, Integer> map = new HashMap<>();
        while (remainder != 0) {
            if (map.containsKey(remainder)) {
                int index = map.get(remainder);
                String str1 = sb.substring(0, index);
                String str2 = "(" + sb.substring(index) + ")";
                return str1 + str2;
            }
            map.put(remainder, sb.length());
            quotient = remainder / den;
            sb.append(quotient);
            remainder = (remainder % den) * 10;
        }
        return sb.toString();
    }
}
