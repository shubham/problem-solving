import java.util.Scanner;

public class GameChallenge {
    public static String GameChallenge(String[] strArr) {
        // code goes here
        int[][] moves = new int[8][3];
        moves[0][0] = 0;
        moves[0][1] = 1;
        moves[0][2] = 2;

        moves[1][0] = 4;
        moves[1][1] = 5;
        moves[1][2] = 6;

        moves[2][0] = 8;
        moves[2][1] = 9;
        moves[2][2] = 10;

        moves[3][0] = 0;
        moves[3][1] = 4;
        moves[3][2] = 8;

        moves[4][0] = 1;
        moves[4][1] = 5;
        moves[4][2] = 9;

        moves[5][0] = 2;
        moves[5][1] = 6;
        moves[5][2] = 10;

        moves[6][0] = 0;
        moves[6][1] = 5;
        moves[6][2] = 10;

        moves[7][0] = 2;
        moves[7][1] = 5;
        moves[7][2] = 8;
        //for X
        for (int i = 0; i < 8; i++) {
            if ((strArr[moves[i][0]].equals("X") &&
                    strArr[moves[i][1]].equals("-")) &&
                    strArr[moves[i][2]].equals("X")) {
                return String.valueOf(moves[i][1]);
            } else if ((strArr[moves[i][0]].equals("-") &&
                    strArr[moves[i][1]].equals("X")) &&
                    strArr[moves[i][2]].equals("X")) {
                return String.valueOf(moves[i][0]);
            } else if ((strArr[moves[i][0]].equals("X") &&
                    strArr[moves[i][1]].equals("X")) &&
                    strArr[moves[i][2]].equals("-")) {
                return String.valueOf(moves[i][2]);
            }
        }
        //for 0
        for (int i = 0; i < 8; i++) {
            if ((strArr[moves[i][0]].equals("0") &&
                    strArr[moves[i][1]].equals("-")) &&
                    strArr[moves[i][2]].equals("0")) {
                return String.valueOf(moves[i][1]);
            } else if ((strArr[moves[i][0]].equals("-") &&
                    strArr[moves[i][1]].equals("0")) &&
                    strArr[moves[i][2]].equals("0")) {
                return String.valueOf(moves[i][0]);
            } else if ((strArr[moves[i][0]].equals("0") &&
                    strArr[moves[i][1]].equals("0")) &&
                    strArr[moves[i][2]].equals("-")) {
                return String.valueOf(moves[i][2]);
            }
        }
        return "0";
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.println(GameChallenge(new String[]{"X", "O", "X", "<>", "-", "O", "O", "<>", "X", "X", "O"}));
        System.out.print(GameChallenge(new String[]{"X", "-", "O", "<>", "-", "-", "O", "<>", "-", "-", "X"}));
    }

}
