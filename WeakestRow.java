public class WeakestRow {
    public static void main(String[] args) {
        WeakestRow weakestRow = new WeakestRow();
        int[] result = weakestRow.kWeakestRows(new int[][]{
                        {1, 1, 0, 0, 0},
                        {1, 1, 1, 1, 0},
                        {1, 0, 0, 0, 0},
                        {1, 1, 0, 0, 0},
                        {1, 1, 1, 1, 1}},
                3);
        for (int num : result) {
            System.out.println("num = " + num);
        }
        System.out.println();
    }

    public int[] kWeakestRows(int[][] mat, int k) {
        int[] sum = new int[mat.length];
        int[] result = new int[k];
        int sumC = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    sumC = sumC + mat[i][j];
                }
            }
            sum[i] = sumC;
            sumC = 0;
        }
        for (int num : sum) {
            System.out.println("num sum= " + num);
        }
        int min = 101;
        int minIndex = -1;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < sum.length; j++) {
                if (sum[j] < min) {
                    minIndex = j;
                    min = sum[j];
                }
            }
            min = 101;
            sum[minIndex] = 101;
            result[i] = minIndex;
            minIndex = -1;
        }
        return result;
    }
}
