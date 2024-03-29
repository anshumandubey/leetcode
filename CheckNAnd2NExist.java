import java.util.HashSet;
import java.util.Set;

public class CheckNAnd2NExist {
    /**
     * Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
     * <p>
     * More formally check if there exists two indices i and j such that :
     * <p>
     * i != j
     * 0 <= i, j < arr.length
     * arr[i] == 2 * arr[j]
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: arr = [10,2,5,3]
     * Output: true
     * Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
     * <p>
     * Example 2:
     * <p>
     * Input: arr = [7,1,14,11]
     * Output: true
     * Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.
     * <p>
     * Example 3:
     * <p>
     * Input: arr = [3,1,7,11]
     * Output: false
     * Explanation: In this case does not exist N and M, such that N = 2 * M.
     * <p>
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 2 <= arr.length <= 500
     * -10^3 <= arr[i] <= 10^3
     */

    public static void main(String[] args) {
        int[] arr = {10, 2, 7, 3};
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        Set<Integer> evenSet = new HashSet<>();
        int zeroCount = 0;
        for (int item : arr) {
            if (item == 0) {
                zeroCount++;
            } else if (item % 2 == 0) {
                evenSet.add(item);
            }
        }
        for (int elem : arr) {
            if (evenSet.contains(elem * 2) || zeroCount > 1) {
                return true;
            }
        }
        return false;
    }
}
