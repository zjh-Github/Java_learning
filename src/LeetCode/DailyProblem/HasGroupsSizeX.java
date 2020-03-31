package LeetCode.DailyProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HasGroupsSizeX {

    /**
     * 已完成
     */
    public static boolean hasGroupsSizeX(int[] deck) {
        int len = deck.length;
        if (len < 2) {
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int count;
        for (int i = 0; i < len; i++) {
            if (map.containsKey(deck[i])) {
                count = map.get(deck[i]) + 1;
            } else {
                count = 1;
            }
            map.put(deck[i], count);
        }
        int result = 0;
        int flag = 0;
        for (int value : map.values()) {
            result = gcd(flag, value);
            if (result == 1) {
                return false;
            }
            flag = value;
        }

        return result >= 2;
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        //1,2,3,4,4,3,2,1
        //1,1,1,2,2,2,3,3
        //1,1,2,2,2,3,3,3,3,3,3
        int[] array = {1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 3};
        System.out.println(hasGroupsSizeX(array));
    }
}
