package com.dubey.leetcode;

import java.util.Arrays;

public class Snowpack {

    /*
     ** Find the amount of snow that could be captured.
     */
    public static Integer computeSnowpack(Integer[] arr) {
        int snowCount = 0;
        int[] arr1 = new int[arr.length];
        int[] arr2 = new int[arr.length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            arr1[i] = max;
        }
        max = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            max = Math.max(max, arr[i]);
            arr2[i] = max;
        }

        for (int i = 0; i < arr.length; i++) {
            snowCount += (Math.min(arr1[i], arr2[i]) - arr[i]);
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        return snowCount;
    }

    /*
     ** Returns true if the tests pass. Otherwise, returns false;
     */
    public static boolean doTestsPass() {
        boolean result = true;
		result = computeSnowpack(new Integer[]{0, 1, 3, 0, 1, 2, 0, 4, 2, 0, 3, 0}) == 13;
//        result &= computeSnowpack(new Integer[]{1, 8, 6, 2, 5, 4, 8, 3, 7}) == 49;
        return result;
    }

    /*
     ** Execution entry point.
     */
    public static void main(String[] args) {
        if (doTestsPass()) {
            System.out.println("All tests pass");
        } else {
            System.out.println("Tests fail.");
        }
    }

}
