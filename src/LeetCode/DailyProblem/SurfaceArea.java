package LeetCode.DailyProblem;

public class SurfaceArea {

    /**
     * 已完成
     */
    public static int surfaceArea(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int result = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] != 0) {
                    result += grid[i][j] * 4 + 2;
                }
                if (i > 0) {
                    result -= Math.min(grid[i][j], grid[i - 1][j]) * 2;
                }
                if (j > 0) {
                    result -= Math.min(grid[i][j - 1], grid[i][j]) * 2;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[][] array = {{1, 2}, {3, 4}};
        System.out.println(surfaceArea(array));
        System.out.println((byte) 10001);
        System.out.println(17 << 3);
    }
}
