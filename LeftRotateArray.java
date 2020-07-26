public class LeftRotateArray {
    // Wrapper over the recursive function leftRotateRec()
    // It left rotates arr[] by d.
//    public static void leftRotate(int[] arr, int d,
//                                  int n) {
//        leftRotateRec(arr, 0, d, n);
//    }
//
//    public static void leftRotateRec(int[] arr, int i,
//                                     int d, int n) {
//        /* Return If number of elements to be rotated
//        is zero or equal to array size */
//        if (d == 0 || d == n)
//            return;
//
//        /*If number of elements to be rotated
//        is exactly half of array size */
//        if (n - d == d) {
//            swap(arr, i, n - d + i, d);
//            printArray(arr, 10);
//            return;
//        }
//
//        /* If A is shorter*/
//        if (d < n - d) {
//            swap(arr, i, n - d + i, d);
//            printArray(arr, 10);
//            leftRotateRec(arr, i, d, n - d);
//            printArray(arr, 10);
//        } else /* If B is shorter*/ {
//            swap(arr, i, d, n - d);
//            printArray(arr, 10);
//            leftRotateRec(arr, n - d + i, 2 * d - n, d); /*This is tricky*/
//            printArray(arr, 10);
//
//        }
//    }

    //Java code for above implementation
    static void leftRotate(int[] arr, int d, int n) {
        int i, j;
        if (d == 0 || d == n)
            return;
        i = d;
        j = n - d;
        while (i != j) {
            if (i < j) /*A is shorter*/ {
                swap(arr, d - i, d + j - i, i);
                j -= i;
            } else /*B is shorter*/ {
                swap(arr, d - i, d, j);
                i -= j;
            }
            printArray(arr, 10);
        }
        /*Finally, block swap A and B*/
        swap(arr, d - i, d, i);
    }

    /*UTILITY FUNCTIONS*/
    /* function to print an array */
    public static void printArray(int[] arr, int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    /*This function swaps d elements
    starting at index fi with d elements
    starting at index si */
    public static void swap(int[] arr, int fi,
                            int si, int d) {
        int i, temp;
        for (i = 0; i < d; i++) {
            temp = arr[fi + i];
            arr[fi + i] = arr[si + i];
            arr[si + i] = temp;
        }
    }

    // Driver Code
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        leftRotate(arr, 3, 10);
        printArray(arr, 10);
    }
}