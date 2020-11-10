public class MinValueStepBySum {
    public static void main(String[] args) {
        MinValueStepBySum minValueStepBySum = new MinValueStepBySum();
        System.out.println("minValueStepBySum = " + minValueStepBySum.minStartValue(new int[]{-3, 2, -3, 4, 2}));
    }

    public int minStartValue(int[] nums) {
        int startValue = 1;
        int sum = startValue;
        for (int num : nums) {
            if (num + sum < 1) {
                startValue += 1 - (num + sum);
                sum += 1 - (num + sum);
            }
            sum += num;
        }
        return startValue;
    }
}
