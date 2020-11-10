/*
 * Problem : https://leetcode.com/problems/elimination-game/
 *
 *
 * */
public class EliminationGame {
    public static void main(String[] args) {
        EliminationGame eliminationGame = new EliminationGame();

        System.out.println(" Number is %s" + eliminationGame.lastRemaining(100000000));
    }

    public int lastRemaining(int n) {
        int left = 1;
        int right = n;
        int base = 1;
        boolean leftSide = true;
        while (left < right) {
            if (leftSide) {
                if ((right - left) % (base * 2) == 0) {
                    right = right - base;
                }
                left += base;
            } else {
                if ((right - left) % (base * 2) == 0) {
                    left = left + base;
                }
                right -= base;
            }
            leftSide = !leftSide;
            base = base * 2;
        }
        return left;
    }

//    public int lastRemaining(int n) {
//        Stack<Integer> left = new Stack<>();
//        Stack<Integer> right = new Stack<>();
//        for (int i = 2; i <= n; i = i + 2) {
//            left.push(i);
//        }
//        boolean leftSide = true;
//        while (!left.isEmpty() || !right.isEmpty()) {
//            if (left.size() == 1 && right.size() == 0) {
//                return left.pop();
//            }
//            if (right.size() == 1 && left.size() == 0) {
//                return right.pop();
//            }
//
//            int i = 1;
//            int num = 0;
//            if (leftSide) {
//                while (!left.isEmpty()) {
//                    num = left.peek();
//                    if (i % 2 == 0) {
//                        right.push(num);
//                    }
//                    i++;
//                    left.pop();
//                }
//                leftSide = false;
//            } else {
//                while (!right.isEmpty()) {
//                    num = right.peek();
//                    if (i % 2 == 0) {
//                        left.push(num);
//                    }
//                    i++;
//                    right.pop();
//                }
//                leftSide = true;
//            }
//        }
//        return 0;
//    }
}
