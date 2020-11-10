public class GreatString {
    public static void main(String[] args) {
        GreatString string = new GreatString();
        System.out.println("string = " + string.makeGood("s"));
    }

    public String makeGood(String s) {
        if (s.length() == 1)
            return s;
        int i = 0;
        while (i < s.length() - 1) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                int j = s.charAt(i) - 'a';
                if (s.charAt(i + 1) == 'A' + j) {
                    char[] chars = s.toCharArray();
                    chars[i] = '-';
                    chars[i + 1] = '-';
                    s = String.valueOf(chars);
                    System.out.println("s = " + s);
                    s = s.replaceAll("-", "");
                    System.out.println("s = " + s);
                    if (i != 0)
                        i -= 1;
                } else {
                    i += 1;
                }
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                int j = s.charAt(i) - 'A';
                if (s.charAt(i + 1) == 'a' + j) {
                    char[] chars = s.toCharArray();
                    chars[i] = '-';
                    chars[i + 1] = '-';
                    s = String.valueOf(chars);
                    System.out.println("s = " + s);
                    s = s.replaceAll("-", "");
                    System.out.println("s = " + s);

                    if (i != 0)
                        i -= 1;
                } else {
                    i += 1;
                }
            }
        }
        return s;
    }
}
