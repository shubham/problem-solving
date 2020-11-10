public class TransposeMatrix {
    public static void main(String[] args) {
        TransposeMatrix matrix = new TransposeMatrix();
        int[][] result = matrix.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}});
        for (int[] ints : result) {
            for (int anInt : ints)
                System.out.println("result = " + anInt);
        }
    }

    public int[][] transpose(int[][] A) {
        int[][] result = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++)
                result[j][i] = A[i][j];
        }
        return result;
    }
}
