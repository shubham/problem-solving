public class KthBitNString {

    public static String binaryString(int n) {
        if (n == 1)
            return "0";
        return binaryString(n - 1) + "1" + reverse(invert(binaryString(n - 1)));
    }

    public static String invert(String s) {
        int i = 0;
        char[] chars = s.toCharArray();
        while (i < s.length()) {
            chars[i++] = chars[i] == '1' ? '0' : '1';
        }
        return String.valueOf(chars);
    }

    public static String reverse(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] chars = s.toCharArray();
        while (i <= s.length() / 2) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        KthBitNString input = new KthBitNString();
        System.out.println("input = " + binaryString(2));
        System.out.println("Kth bit = " + input.findKthBit(2, 3));
    }

    public char findKthBit(int n, int k) {
        return binaryString(n).charAt(k - 1);
    }

}
