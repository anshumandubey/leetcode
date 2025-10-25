package com.dubey.leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OptimalPartitionOfString {
    public static void main(String[] args) {
        List<String> inputs = List.of("abacaba", "ssssss", "car", "leetcode", "program");
        for (String input : inputs) {
            System.out.println(new OptimalPartitionOfString().partitionString(input));
        }
    }
    public int partitionString(String s) {
        Set<Character> set = new HashSet<>();
        int count = 1;

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                count++;
                set.clear();
            }
            set.add(c);
        }

        return count;
    }
}
