import java.util.Scanner;

public class CodeMonk {
    //    class A {
    final int age;

    CodeMonk(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        int[] sum = new int[num];
//        for (int i = 0; i < num; i++) {
//            sum[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < num; i++) {
//            sum[i] = sum[i] + scanner.nextInt();
//            System.out.print(sum[i]);
//        }
//        int a=30;
//        System.out.println(a<<1);

        CodeMonk a = new CodeMonk(25);
        CodeMonk b = new CodeMonk(25);
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }

    @Override
    public int hashCode() {
        return 5;
    }

//    }
}
