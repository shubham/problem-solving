import java.util.HashMap;

/**
 * Problem Link :
 * https://leetcode.com/problems/find-lucky-integer-in-an-array/
 * <p>
 * for problem description go to Above link
 */
public class LuckyIntegers {
    public static void main(String[] args) {
        LuckyIntegers integers = new LuckyIntegers();
        System.out.println("integers = " + integers.findLucky(new int[]{2, 2, 2, 3}));
    }

    public int findLucky(int[] arr) {
        int max = -1;
        HashMap<Integer, Integer> data = new HashMap<>();

        for (int num : arr) {
            data.put(num, data.getOrDefault(num, 0) + 1);
        }
        for (int num : arr) {
            if (num == data.get(num) && max <= num) {
                max = num;
            }
        }
        return max;
    }
}
