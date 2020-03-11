package LeetCode;

import java.util.Map;
import java.util.TreeMap;

public class MaxArea {
    /**
     * 已完成
     *
     */
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 10, 6, 2, 5, 4, 10, 3, 9}));
    }

    public static int maxArea(int[] height) {
        int result = 0;
        int len = height.length;
        int i = 0, j = len - 1;
        if (len < 2) {
            return result;
        }
        while (i < j) {
            int var = Math.min(height[i], height[j]);
            int temp = (j - i) * var;
            result = Math.max(temp, result);
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
            System.out.println(result);
        }
        result = 0;
        for (i = 0; i < len; i++) {
            for (j = len - 1; j > i; j--) {
                int var = Math.min(height[i], height[j]);
                int temp = (j - i) * var;
                result = Math.max(temp, result);
            }
        }
        return result;
    }
}
