package LeetCode;

public class CanMeasureWater {
    /**
     * 已完成
     */
    public static boolean canMeasureWater(int x, int y, int z) {
        if (x + y < z) {
            return false;
        }
        int min = Math.min(x, y);
        int max = Math.max(x, y);
        while (min != 0) {
            int temp = max % min;
            max = min;
            min = temp;
        }
        if (max == 0) {
            return true;
        }
        return z % max == 0;
    }

    public static void main(String[] args) {
        System.out.println(canMeasureWater(3, 5, 4));

    }
}
