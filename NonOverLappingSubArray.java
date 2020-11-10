import java.util.HashMap;

/**
 * Problem Link :
 * https://leetcode.com/problems/maximum-number-of-non-overlapping-subarrays-with-sum-equals-target/
 * <p>
 * for problem description go to Above link
 */
public class NonOverLappingSubArray {
    public static void main(String[] args) {
        NonOverLappingSubArray solution = new NonOverLappingSubArray();
        System.out.println("solution = " +
                solution.maxNonOverlapping(new int[]{1, 1, 1, 1, 1}, 2));
    }

    public int maxNonOverlapping(int[] nums, int target) {
        int sum = 0;
        int count = 0;
        int j = -1;
        HashMap<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int remain = sum - target;
            if (prefixMap.containsKey(remain) && prefixMap.get(remain) >= j) {
                count++;
                j = i;
            }
            prefixMap.put(sum, i);
        }
        return count;
    }
}
