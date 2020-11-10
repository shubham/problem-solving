import java.util.HashMap;

public class SplashLearn {


    public static void main(String[] args) {
        System.out.println("Max Sum Pair" + findMaxDigitSum(new int[]{55, 23, 32, 46, 88}));
    }

    public static int findMaxDigitSum(int[] arr) {
        if (arr == null)
            return -1;

        HashMap<Integer, Integer> data = new HashMap<>();
        int max = 0;
        int currentMax = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            System.out.println(digitSum(arr[i]));
            System.out.println(data.keySet());
            System.out.println("max"+ max);
            if (data.containsKey(digitSum(arr[i]))) {
                currentMax = data.get(digitSum(arr[i])) + arr[i];
                if (max < currentMax)
                    max = currentMax;
            } else {
                data.put(digitSum(arr[i]), arr[i]);
            }
        }
        return max;
    }

    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}