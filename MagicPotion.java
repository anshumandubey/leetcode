package com.dubey.leetcode;

public class MagicPotion {
    public static void main(String[] args) {
        if (minimalSteps("ABCDABCE") == 8 && minimalSteps("ABCABCE") == 5 && minimalSteps("ABABCABABCE") == 6) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    private static int minimalSteps(String string) {
        int length = 1;
        int i = 1;
        while (i < string.length()) {
            if (2 * i <= string.length() && string.substring(0, i).equals(string.substring(i, 2 * i))) {
                i = 2 * i;
            } else {
                i++;
            }
            length++;
        }
        System.out.println(length);
        return length;
    }
}
