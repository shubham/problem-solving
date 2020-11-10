public class CanMakeArithmaticProgression {
    public static void main(String[] args) {
        CanMakeArithmaticProgression arithmaticProgression = new CanMakeArithmaticProgression();
        System.out.println(arithmaticProgression.canMakeArithmeticProgression(new int[]{1, 2, 4}));
    }

    public boolean canMakeArithmeticProgression(int[] arr) {
        int max = -1000001;
        int min = 1000001;
        int temp = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
            sum += temp;
        }
        System.out.println("sum:" + sum + " max:" + max + " min:" + min);
        return sum == ((min + max) * arr.length) / 2.0;
    }
}
