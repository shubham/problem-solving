import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MissedParenthesis {

    public static void main(String[] args) {
        int num=-62;
        System.out.println();
//        MissedParenthesis missedParenthesis = new MissedParenthesis();
//        System.out.println(missedParenthesis.removeDuplicates("abbaca"));
    }

    public String removeOuterParentheses(String S) {
        if (S.length() <= 2)
            return "";
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (char s : S.toCharArray()) {
            if (count == 0) {
                count++;
                continue;
            }
            if (s == '(') {
                result.append(s);
                count++;
            } else if (s == ')') {
                count--;
                result.append(s);
            }
        }
        return result.toString();
    }

    public List<String> buildArray(int[] target, int n) {
        String push = "PUSH";
        String pop = "POP";
        List<String> result = new ArrayList<>();
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if (target[j] == i) {
                result.add(push);
                j++;
            } else {
                result.add(push);
                result.add(pop);
            }
            if (j == target.length) {
                break;
            }
        }
        return result;
    }

    public String removeDuplicates(String S) {
        Stack<Character> strings = new Stack<>();
        for (char c : S.toCharArray()) {
            if (!strings.isEmpty() && c == strings.peek()) {
                strings.pop();
            } else {
                strings.push(c);
            }
        }
        System.out.println(strings);
        if (strings.isEmpty()) {
            return "";
        } else {
            StringBuilder result = new StringBuilder();
            for (Character string : strings) {
                result.append(string);
            }
            return result.toString();
        }
    }

}
