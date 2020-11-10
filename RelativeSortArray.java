import java.util.Arrays;
import java.util.HashMap;

public class RelativeSortArray {
    public static void main(String[] args) {
        RelativeSortArray relativeSortArray = new RelativeSortArray();
        int[] result = relativeSortArray.relativeSortArray(
                new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19},
                new int[]{2, 1, 4, 3, 9, 6}
        );
        for (int num : result) {
            System.out.println("num = " + num);
        }
    }

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        HashMap<Integer, Integer> valuesA1 = new HashMap<>();
        for (int num : arr1) {
            valuesA1.put(num, valuesA1.getOrDefault(num, 0) + 1);
        }
        int i = 0;
        for (int num : arr2) {
            if (valuesA1.containsKey(num)) {
                int value = valuesA1.getOrDefault(num, 0);
                if (i < arr1.length) {
                    for (int j = 0; j < value; j++) {
                        result[i++] = num;
                    }
                    valuesA1.remove(num);
                }
            }
        }
        int k = i;

        for (int num : valuesA1.keySet()) {
            int value = valuesA1.getOrDefault(num, 0);
            for (int j = 0; j < value; j++) {
                result[i++] = num;
            }
        }
        Arrays.sort(result, k, i);
        return result;
    }
}
