public class DivisiblityOfString {

    public static int findSmallestDivisor(String s, String t) {

        //finding s can be made from t or not
        if (s.length() % t.length() != 0)
            return -1;
        int count = s.length() / t.length();
        String s1 = "";
        for (int i = 0; i < count; i++) {
            s1 = s1 + t;
        }
        int min = -1;
        if (s1.equals(s))
            min = t.length();
        else return -1;

        //finding substring can be made from t or not;
        // if yes then finding below else returning length of t
        int start = 0;
        int end = 1;
        while (end < t.length()) {
            if (s.charAt(start) == s.charAt(end))
                start++;
            else {
                if (start != 0)
                    end--;
                start = 0;
            }
            end++;
        }
        int length = end - start;

        return Math.min(min, length);
    }

    public static void main(String[] args) {
        System.out.println(findSmallestDivisor("bcdbcdbcdbcd","bcdbcd"));
    }
}
