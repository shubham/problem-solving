public class ReturningSum {
    public static void main(String[] args) {
        ReturningSum sum = new ReturningSum();
        int[] sumArray = sum.runningSum(new int[]{1, 2, 3, 4});
        for (int num : sumArray) {
            System.out.print(num + "\t");
        }
        System.out.println();
    }

    public int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
