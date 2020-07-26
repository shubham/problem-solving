import java.util.Scanner;

public class BinaryQueries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int queries = scanner.nextInt();
        int nextInput = 0;
        int l = 0, r = 0;
        int[] numArr = new int[num];

        for (int i = 0; i < num; i++)
            numArr[i] = scanner.nextInt();

        for (int i = 0; i < queries; i++) {
            nextInput = scanner.nextInt();
            if (nextInput == 0) {
                l = scanner.nextInt() - 1;
                r = scanner.nextInt() - 1;
                if (numArr[r] == 0)
                    System.out.println("EVEN");
                else System.out.println("ODD");
            } else if (nextInput == 1) {
                l = scanner.nextInt();
                numArr[l - 1] = numArr[l - 1] == 1 ? 0 : 1;
            }
        }
    }
}
