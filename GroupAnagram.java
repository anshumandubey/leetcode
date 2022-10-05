package com.dubey.leetcode;

import java.util.*;

public class GroupAnagram {

    static String input = "cat dog tac sat tas god dog";

    public static void main(String[] args) {
        String input = "cat dog tac sat tas god dog";
        setOfAnagrams(input);
    }

    private static void setOfAnagrams(String input) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        String[] inputArr = input.split(" ");
        for (String str : inputArr) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            if (map.containsKey(Arrays.toString(arr))) {
                map.get(Arrays.toString(arr)).add(str);
            } else {
                List<String> strList = new ArrayList<String>();
                strList.add(str);
                map.put(Arrays.toString(arr), strList);
            }
        }
        StringBuilder sb1 = new StringBuilder();
        System.out.println("Hello" + sb1.toString());
        StringBuilder sb = new StringBuilder();
        for (List<String> strList : map.values()) {
            for (String str : strList) {
                sb.append(str + " ");
            }
        }
        System.out.println(sb.toString());
    }
}
