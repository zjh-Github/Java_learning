package LeetCode.DailyProblem;

public class GameOfLife {
    public static void gameOfLife(int[][] board) {
        int[][] array = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                array[i][j] = board[i][j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                int result = BFS(array, i, j, array[i][j]) - 1;
                System.out.println("result:" + result);
                if (array[i][j] == 0) {
                    if (result == 3) {
                        board[i][j] = 1;
                    }
                } else {
                    if (result < 2 || result > 3) {
                        board[i][j] = 0;
                    }
                }
            }
        }
    }

    public static int BFS(int[][] array, int x, int y, int flag) {
        int count = 0;
        System.out.println("x and y :" + x + "、" + y);
        if (x < 0 || x > array.length - 1 || y < 0 || y > array[0].length - 1) {
            return 0;
        }
        if (flag == array[x][y]) {
            count++;
        }
        count += BFS(array, x - 1, y, flag);
        count += BFS(array, x + 1, y, flag);
        count += BFS(array, x, y - 1, flag);
        count += BFS(array, x, y + 1, flag);
        count += BFS(array, x - 1, y - 1, flag);
        count += BFS(array, x - 1, y + 1, flag);
        count += BFS(array, x + 1, y - 1, flag);
        count += BFS(array, x + 1, y + 1, flag);
        System.out.println("count:" + count);
        return count;
    }

    public static void main(String[] args) {
        int[][] array = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };
        gameOfLife(array);
    }
}
