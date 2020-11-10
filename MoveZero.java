import java.util.Stack;


public class MoveZero {
    /* package whatever; // don't place package name! */


    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        //arr = [0,1,9,0,0,5,6,4,0,0,0]
        // result= [1,9,5,6,4,0,0,0,0,0,0]
        int[] result = moveZero(new int[]{0, 1, 9, 0, 0, 5, 6, 4, 0, 0, 0});
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ", ");
        }
    }

    public static int[] moveZero(int[] arr) {
        if (arr == null && arr.length == 0) {
            return arr;
        }
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
        for (int i = j; i <arr.length; i++) {
            arr[i]=0;
        }
        return arr;
    }


    public static int[] moveZeros(int[] arr) {
        if (arr == null && arr.length == 0) {
            return arr;
        }
        Stack<Integer> values = new Stack<>();
        int countZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                values.push(arr[i]);
                arr[i] = 0;
            } else
                countZero++;
        }

        if (countZero == 0)
            return arr;
        else {
            for (int i = arr.length - countZero - 1; i > -1; i--) {
                arr[i] = values.pop();
            }
        }
        return arr;
    }
}