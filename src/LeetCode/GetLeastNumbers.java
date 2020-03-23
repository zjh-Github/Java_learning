package LeetCode;

import java.util.Arrays;

public class GetLeastNumbers {

    /**
     * 已完成
     */
    public static int[] getLeastNumbers(int[] arr, int k) {
        int[] result = new int[k];
        int len = arr.length;
        if (len == 0 || len <= k) {
            return arr;
        }
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 1};
        System.out.println(getLeastNumbers(array, 1));
    }
}
