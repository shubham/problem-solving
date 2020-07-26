public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = new int[1];
        nums[0] = 10000;
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int c = 0;
        int noDigit = 0;

        for (int num : nums) {
            noDigit = 0;
            noDigit = (int) Math.log10(num);
            if ((noDigit % 2 == 0)) {
                c++;
            }
        }
        return c;
    }
}
