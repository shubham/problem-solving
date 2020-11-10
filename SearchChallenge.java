import java.util.Scanner;
import java.util.Stack;

public class SearchChallenge {


    public static String SearchingChallenge(String str) {
        // code goes here
        int result = 0;
        Stack<Character> para = new Stack<>();
        for (char c : str.toCharArray()) {
            if (!para.isEmpty() && (c == ')' || c == ']')) {
                if (para.peek() == '(' && c == ')') {
                    para.pop();
                    result++;
                }
               else if (para.peek() == '[' && c == ']') {
                    para.pop();
                    result++;
                }else {
                   return "0";
                }
            } else {
                if (c == '(' || c == '[') {
                    para.push(c);
                } else if (para.isEmpty() && (c == ')' || c == ']')) {
                    return "0";
                }
            }
        }
        return result == 0 ? "0" : "1 " + result;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(SearchingChallenge(s.nextLine()));
    }


}
