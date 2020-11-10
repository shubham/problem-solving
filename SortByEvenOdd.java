import java.util.ArrayList;
import java.util.List;

public class SortByEvenOdd {
    public static void main(String[] args) {
        SortByEvenOdd sortByEvenOdd = new SortByEvenOdd();
        int[] result = sortByEvenOdd.sortArrayByParity(new int[]{3, 1, 2, 4});
        for (Integer integer : result)
            System.out.print(integer + " \t");
    }

    public int[] sortArrayByParity(int[] A) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int k : A) {
            if (k % 2 == 0)
                even.add(k);
            else
                odd.add(k);
        }
        int j = 0;
        for (Integer integer : even) A[j++] = integer;
        for (Integer integer : odd) A[j++] = integer;
        return A;
    }
}
