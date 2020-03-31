package LeetCode.DailyProblem;

import java.util.Arrays;

public class SortArray {
    /**
     * 已完成
     */
    public static int[] sortArray(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    public static int[] quickSort(int[] array, int left, int right) {
        if (left > right) {
            return array;
        }
        int flag = array[left];
        int i = left, j = right;
        while (i < j) {
            while (array[j] >= flag && i < j) j--;
            while (array[i] <= flag && i < j) i++;
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        array[left] = array[i];
        array[i] = flag;
        quickSort(array, left, i - 1);
        quickSort(array, i + 1, right);
        return array;
    }

    public static void swap(int[] array, int i, int j) {
        if (i < j) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
        System.out.println(i + "、" + j);
    }

    public static void main(String[] args) {

        int[] array = {5, 1, 1, 2, 0, 0};
//        Arrays.sort(array);
//        swap(array, 1, 4);
        System.out.println(sortArray(array));
    }
}
