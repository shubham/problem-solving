import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximiseTheElement {
    public static int getMaxValue(List<Integer> arr) {
        Collections.sort(arr);
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(0) != 1) {
                arr.set(0, arr.get(0) - (arr.get(0) - 1));
            }
            if (!(arr.get(i + 1) - arr.get(i) <= 1)) {
                arr.set(i + 1, arr.get(i) + 1);
            }
        }
        return arr.get(arr.size() - 1);
    }

    public static void main(String[] args) {
        System.out.println(getMaxValue(Arrays.asList(3, 1, 3, 4)));
        System.out.println(getMaxValue(Arrays.asList(1, 3, 2, 2)));
        System.out.println(getMaxValue(Arrays.asList(2, 3, 3, 5)));
    }
}
