import java.util.HashMap;

/**
 * Problem Link :
 * https://leetcode.com/problems/count-largest-group/
 * <p>
 * for problem description go to Above link
 */
public class CountLargestGroup {
    public static void main(String[] args) {
        CountLargestGroup countLargestGroup = new CountLargestGroup();
        System.out.println("Count = " + countLargestGroup.countLargestGroup(24));
    }

    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    public int countLargestGroup(int n) {
        if (n >= 1 && n <= 9)
            return n;
        HashMap<Integer, Integer> data = new HashMap<>();
        int sum;
        for (int i = 0; i <= n; i++) {
            sum = sumDigits(i);
            data.put(sum, data.getOrDefault(sum, 0) + 1);
        }
        int max = 0;
        for (int num : data.keySet()) {
            if (max < data.get(num))
                max = data.get(num);
        }
        int count = 0;
        for (int num : data.keySet()) {
            if (max == data.get(num))
                count++;
        }
        return count;
    }
}
