package LeetCode.DailyProblem;

public class NumRookCaptures {
    /**
     * 已完成
     */
    public static int numRookCaptures(char[][] board) {
        int result = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    System.out.println(board[i][j] + "、" + i + "、" + j);
                    result = DFS(board, i, j, 1) + DFS(board, i, j, 2) + DFS(board, i, j, 3) + DFS(board, i, j, 4);
                }
            }
        }

        return result;
    }

    public static int DFS(char[][] array, int x, int y, int flag) {
        if (x < 0 || x > array.length - 1 || y < 0 || y > array[0].length - 1 || array[x][y] == 'B') {
            return 0;
        }
        if (array[x][y] == 'p') {
            return 1;
        }
        if (flag == 1) x--;
        if (flag == 2) x++;
        if (flag == 3) y--;
        if (flag == 4) y++;

        return DFS(array, x, y, flag);
    }

    public static void main(String[] args) {
        //'p','p','.','R','.','p','B','.'
        char[][] array = {
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', 'p'},
                {'.', 'p', 'p', 'R', 'p', 'p', '.', '.'},
                {'.', '.', '.', 'B', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}};
        System.out.println(numRookCaptures(array));
    }
}
