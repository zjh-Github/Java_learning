package LeetCode.DailyProblem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LastRemaining {
    /**
     * 已完成
     */
    public static int lastRemaining(int n, int m) {
        if (m <= 1 || n <= 1) {
            return n - 1;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int flag = 0;
        int size = list.size();
        while (size > 1) {
            int temp = (m + flag - 1) % size;
            list.remove(temp);
            flag = temp;
            size--;
        }
        return list.get(0);
    }

    public static int lastRemaining1(int n, int m) {
        if (m <= 1 || n <= 1) {
            return n - 1;
        }
        int flag = 0;
        for (int i = 2; i <= n; i++) {
            flag = (m + flag) % i;
        }
        return flag;
    }

    public static void main(String[] args) {

        System.out.println(lastRemaining(5, 3));
        System.out.println(lastRemaining(10, 17));

        System.out.println("==============");
        System.out.println(lastRemaining1(5, 3));
        System.out.println(lastRemaining1(10, 17));

    }
}
