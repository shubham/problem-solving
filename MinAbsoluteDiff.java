import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinAbsoluteDiff {
    public static void main(String[] args) {
        MinAbsoluteDiff absoluteDiff = new MinAbsoluteDiff();
        List<List<Integer>> result = absoluteDiff.minimumAbsDifference(
                new int[]{1, 3, 6, 10, 15});
        for (List<Integer> list : result) {
            for (int num : list) {
                System.out.print(" num = " + num);
            }
            System.out.println();
        }
    }

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff = 1000001;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] < minDiff)
                minDiff = arr[i + 1] - arr[i];
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == minDiff) {
                List<Integer> arrResult = new ArrayList<>();
                arrResult.add(arr[i]);
                arrResult.add(arr[i + 1]);
                result.add(arrResult);
            }
        }
        return result;
    }
}
