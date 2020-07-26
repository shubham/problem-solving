public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray duplicates = new RemoveDuplicatesFromSortedArray();
        System.out.println(duplicates.removeDuplicates(new int[]{1,1,2}));
    }

    public int removeDuplicates(int[] nums) {
        int uniqueCount = 1;
        int index = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1] && index < 0) {
                index = i + 1;
            } else if (nums[i] < nums[i + 1]) {
                nums[uniqueCount] = nums[i + 1];
                index = -1;
                uniqueCount++;
            }
            for (int num : nums) {
                System.out.print(num);
            }
            System.out.println();
        }
        return uniqueCount;
    }
}
