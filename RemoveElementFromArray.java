public class RemoveElementFromArray {

    public static void main(String[] args) {
        RemoveElementFromArray duplicates = new RemoveElementFromArray();
        System.out.println(duplicates.removeElement(new int[]{3,2,2,3}, 3));
    }

    public int removeElement(int[] nums, int val) {
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[p] = nums[i];
                p++;
            }
        }
        return p;
    }
}

