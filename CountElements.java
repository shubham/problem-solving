import java.util.HashMap;

public class CountElements {
    public static void main(String[] args) {
// Sort the Array
        int[] arr = {1,1,3,3,5,5,7,7 };
        CountElements elements = new CountElements();

        System.out.println(elements.countElements(arr));
    }

    public int countElements(int[] arr) {

        int sum = 0;
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (countMap.containsKey(arr[i])) {
                countMap.put(arr[i], countMap.get(arr[i]) + 1);
            } else {
                countMap.put(arr[i], 1);
            }
        }

        for (Integer data : countMap.keySet()) {
            if (countMap.containsKey(data + 1)) {
                sum += countMap.get(data);
            }
        }
        return sum;
    }
}
