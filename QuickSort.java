package com.dubey.leetcode;

import java.util.Arrays;

public class QuickSort {
    public static int partition(int[] arr, int l, int h) {
        int pivotIndex = (l + h) / 2;
        int temp = arr[l];
        arr[l] = arr[pivotIndex];
        arr[pivotIndex] = temp;
        int pivot = arr[l];
        System.out.println(pivot);
        int i = l+1;
        int j = h;
        while (i <= j) {
            while (i <= h && arr[i] < pivot) i++;
            while (j >= l && arr[j] > pivot) j--;
            if(i <= j) {
                int temp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp1;
                i++;
                j--;
            }
        }
        int temp1 = arr[l];
        arr[l] = arr[j];
        arr[j] = temp1;
        return j;
    }

    public static void quickSort(int[] arr, int l, int h) {
        if (l < h) {
            int piv = partition(arr, l, h);
            quickSort(arr, l, piv-1);
            quickSort(arr, piv+1, h);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 56, 22, 64, 76, 41, 32, 67};
        quickSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
