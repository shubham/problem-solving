public class CaptureRook {
    public static void main(String[] args) {
        CaptureRook rook = new CaptureRook();
        System.out.println("rook = " + rook.numRookCaptures(
                new char[][]{
                        {'.', '.', '.', 'p', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.'},
                        {'p', '.', '.', 'R', '.', '.', '.', 'p'},
                        {'.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', '.', '.', '.', '.', '.'},
                        {'.', '.', '.', 'B', '.', '.', '.', '.'}
                }
        ));
    }

    public int numRookCaptures(char[][] board) {
        int r = -1, c = -1;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    r = i;
                    c = j;
                    break;
                }
            }
        }
        int count = 0;
        for (int i = c + 1; i < 8; i++) {
            if (board[r][i] == 'p') {
                count++;
                break;
            } else if (board[r][i] == 'B') {
                break;
            }
        }
        for (int i = c - 1; i >= 0; i--) {
            if (board[r][i] == 'p') {
                count++;
                break;
            } else if (board[r][i] == 'B') {
                break;
            }
        }
        for (int i = r + 1; i < 8; i++) {
            if (board[i][c] == 'p') {
                count++;
                break;
            } else if (board[r][i] == 'B') {
                break;
            }
        }
        for (int i = r - 1; i >= 0; i--) {
            if (board[i][c] == 'p') {
                count++;
                break;
            } else if (board[r][i] == 'B') {
                break;
            }
        }
        return count;
    }
}
