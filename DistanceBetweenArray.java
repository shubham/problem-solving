import java.util.Arrays;

public class DistanceBetweenArray {
    public static void main(String[] args) {
        DistanceBetweenArray betweenArray = new DistanceBetweenArray();
        System.out.println("betweenArray = " + betweenArray.findTheDistanceValue(
                new int[]{4, -3, -7, 0, -10}, new int[]{10}, 69
        ));
    }

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int result = 0;
        Arrays.sort(arr2);
        for (int num : arr1) {
            result++;
            int l = 0;
            int r = arr2.length-1;
            int mid = (l + r) / 2;
            while (l <= r) {
                if (Math.abs(arr2[mid] - num) <= d) {
                    result--;
                    break;
                }
                if (arr2[mid] == num)
                    break;
                else if (arr2[mid] > num) {
                    r = mid - 1;
                } else
                    l = mid + 1;
            }
        }
        return result;
    }
}
