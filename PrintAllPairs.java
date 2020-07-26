import java.util.Scanner;

public class PrintAllPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[] pairArray = new char[2 * n];
        findAllPairs(pairArray,n);
    }

    static void findAllPairs(char[] pairArray, int n) {

        printAllPairs(pairArray, 0, 0, 0, n);
        System.out.println(n);
    }

    static void printAllPairs(char[] pairArray, int start, int end, int position, int n) {
        System.out.println(n + " " + start + " " + end + " " + position);
        if (end == n) {
            int i = 0;
            while (i < pairArray.length) {
                System.out.println(pairArray[i]);
                i++;
            }
            System.out.println();
            return;
        } else {
            if (start > end) {
                pairArray[position] = ')';
                printAllPairs(pairArray, start , end+1, position + 1, n);
            }
            if (start < n) {
                pairArray[position] = '(';
                printAllPairs(pairArray, start +1, end, position + 1, n);
            }
        }
    }
}
