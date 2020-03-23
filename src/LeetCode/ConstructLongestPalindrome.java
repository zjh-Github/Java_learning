package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ConstructLongestPalindrome {
    /**
     * 已完成
     * 构造最长回文串
     */

    public static int longestPalindrome(String s) {
        int len = s.length();
        int result = 0;
        if (len <= 1) {
            return len;
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int count;
            if (map.containsKey(String.valueOf(s.charAt(i)))) {
                count = map.get(String.valueOf(s.charAt(i))) + 1;
            } else {
                count = 1;
            }
            map.put(String.valueOf(s.charAt(i)), count);
        }
        if (map.size() == 1) {
            return len + result;
        }
        System.out.println("map:" + map);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                result += entry.getValue();
            } else {
                result += entry.getValue() - 1;
                entry.setValue(1);
            }
        }
        if (map.containsValue(1)) {
            result += 1;
        }
        return result;
    }

    public static int longestPalindrome1(String s) {
        int len = s.length();
        int result = 0;
        if (len <= 1) {
            return len;
        }
        int[] array = new int[128];
        HashMap<String, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
//            System.out.println(c);
            array[c - 'A'] += 1;
        }
        for (int a : array) {
            System.out.println(a);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome1("ababababaccc"));
    }
}
