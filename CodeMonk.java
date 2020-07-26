import java.util.Scanner;

public class CodeMonk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] sum = new int[num];
        for (int i = 0; i < num; i++) {
            sum[i] = scanner.nextInt();
        }
        for (int i = 0; i < num; i++) {
            sum[i] = sum[i] + scanner.nextInt();
            System.out.print(sum[i]);
        }
    }
}
