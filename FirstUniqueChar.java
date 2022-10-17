package com.dubey.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstUniqueChar {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Long> frMap = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
        for (int i = 0; i < chars.length; i++) {
            if (frMap.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
