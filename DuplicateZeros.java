import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DuplicateZeros {
    /**
     * Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
     * <p>
     * Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: arr = [1,0,2,3,0,4,5,0]
     * Output: [1,0,0,2,3,0,0,4]
     * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
     * <p>
     * Example 2:
     * <p>
     * Input: arr = [1,2,3]
     * Output: [1,2,3]
     * Explanation: After calling your function, the input array is modified to: [1,2,3]
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= arr.length <= 104
     * 0 <= arr[i] <= 9
     */
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void duplicateZeros(int[] arr) {
        Queue<Integer> stack = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            int temp = !stack.isEmpty() ? stack.remove() : Integer.MIN_VALUE;
            if (arr[i] == 0) {
                stack.add(arr[i]);
            }
            if (temp != Integer.MIN_VALUE) {
                stack.add(arr[i]);
                arr[i] = temp;
            }
        }
    }
}
