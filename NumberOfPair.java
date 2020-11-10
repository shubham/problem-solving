import java.util.HashMap;

public class NumberOfPair {
    public static void main(String[] args) {
        NumberOfPair numberOfPair = new NumberOfPair();
        System.out.println(numberOfPair.numIdenticalPairs(new int[]{3,5,6,3,3,5}));
    }

    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numMap.get(nums[i]) != null)
                numMap.put(nums[i], numMap.get(nums[i]) + 1);
            else
                numMap.put(nums[i], 1);
        }
        int count = 0;
        int value;
        for (int num : numMap.keySet()) {
            value = numMap.get(num);
            count = count + (value * (value - 1)) / 2;
        }
        return count;
    }
}
