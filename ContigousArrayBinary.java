import java.util.Stack;

public class ContigousArrayBinary {
    /*
    Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.

    Example 1:
    Input: [0,1]
    Output: 2
    Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.
    Example 2:
    Input: [0,1,0]
    Output: 2
    Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
     */
    public static void main(String[] args) {
        ContigousArrayBinary arrayBinary = new ContigousArrayBinary();
        System.out.println(arrayBinary.findMaxLength(new int[]{0, 0, 1, 0, 0, 0, 1, 1}));
        //[0,0,1,0,0,0,1,1]

    }
    private Stack<Integer> integerStack=new Stack<>();

    public int findMaxLength(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (isZeroOneEqual(nums, i)) {
                return nums.length - i;
            }
        }
        return 0;
    }

    private static boolean isZeroOneEqual(int[] nums, int start) {
        int c0 = 0;
        int c1 = 0;
        for (int i = start; i < nums.length; i++) {
            if (nums[i] == 0) {
                c0 += 1;
            } else {
                c1 += 1;
            }
        }
        return (c0 == c1);
    }
}
