import java.util.Scanner;

class CyclicShiftingNumber {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String binaryNumber = "";
        int num = 0;
        int noOfMoves = 0;
        String toShift = "";
        String temp;
        for (int i = 0; i < n; i++) {
            num = s.nextInt();
            binaryNumber = String.format("%16s", Integer.toBinaryString(num)).replace(' ', '0');
            noOfMoves = s.nextInt();
            toShift = s.next();
            if ("L".contentEquals(toShift)) {
                temp = binaryNumber.substring(0, noOfMoves);
                temp = binaryNumber.substring(noOfMoves) + temp;
            } else {
                temp = binaryNumber.substring(binaryNumber.length() - noOfMoves);
                temp = temp + binaryNumber.substring(0, binaryNumber.length() - noOfMoves);
            }
            System.out.println(Integer.parseInt(temp, 2));
        }
    }
}
