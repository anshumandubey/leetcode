public class ValidMountainArray {
    /**
     * Given an array of integers arr, return true if and only if it is a valid mountain array.
     *
     * Recall that arr is a mountain array if and only if:
     *
     *     arr.length >= 3
     *     There exists some i with 0 < i < arr.length - 1 such that:
     *         arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
     *         arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
     *
     *
     *   Link: https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/
     */

    public static void main(String[] args) {
        int[] arr = {0,3,2,1};
        System.out.println(validMountainArray(arr));
    }

    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            if (arr[start+1] > arr[start]) {
                start++;
            } else if (arr[end-1] > arr[end]) {
                end--;
            } else {
                break;
            }
        }
        return start != 0 && end != arr.length-1 && start == end;
    }
}
