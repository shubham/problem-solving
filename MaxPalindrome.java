import java.util.HashMap;

public class MaxPalindrome {

    public static int longestPalindrome(String s) {

        if (s.length() == 1)
            return 1;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        boolean odd = false;
        int count = s.length();
        for (Character character : map.keySet()) {
            if (map.get(character) % 2 != 0) {
                if (!odd)
                    odd = true;
                else {
                    count--;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        longestPalindrome("a");
        longestPalindrome("abccccdd");
        longestPalindrome("bb");
    }
}
