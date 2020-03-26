package LeetCode.DailyProblem;

import java.util.*;

public class MinIncrementForUnique {

    /**
     * 已完成
     */
    public static int minIncrementForUnique(int[] A) {
        int len = A.length;
        int result = 0;
        if (len < 2) {
            return 0;
        }
        Arrays.sort(A);
        for (int i = 0; i < len - 1; i++) {

        }

        return result;
    }

    public static int test(int[] A) {
        // 先排序
        Arrays.sort(A);
        int move = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] <= A[i - 1]) {
                int pre = A[i];
                A[i] = A[i - 1] + 1;
                move += A[i] - pre;
            }
        }
        return move;

    }

    public static int unique(int[] array) {
        int len = array.length;
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(array[i])) {
                boolean flag = true;
                while (flag) {
                    if (map.containsKey(array[i])) {
                        array[i] += 1;
                        result++;
                    } else {
                        flag = false;
                    }
                }
            }
            map.put(array[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        //3,2,1,2,1,7
        //输出：6
        //1,2,2
        //输出：1
        int[] array = {1, 1, 4, 7, 10};
        System.out.println(test(array));
    }
}
