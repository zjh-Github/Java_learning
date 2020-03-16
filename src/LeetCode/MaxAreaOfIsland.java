package LeetCode;

public class MaxAreaOfIsland {
    /**
     * 完成30% 余DFS
     */
    public static int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == 1) {
                    count = Math.max(DFS(grid, i, j), count);
                }
            }
        }
        return count;
    }

    public static int DFS(int[][] array, int x, int y) {
        int count = 1;
        if (x < 0 || x > array.length - 1 || y < 0 || y > array[0].length - 1 || array[x][y] != 1) {
            return 0;
        }
        array[x][y] = 0;
        count += DFS(array, x - 1, y);
        count += DFS(array, x + 1, y);
        count += DFS(array, x, y - 1);
        count += DFS(array, x, y + 1);
        return count;
    }

    public static void main(String[] args) {
        int[][] array = {{0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};
        System.out.println(maxAreaOfIsland(array));
    }

}
