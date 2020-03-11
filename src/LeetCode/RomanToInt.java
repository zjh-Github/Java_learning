package LeetCode;
import java.util.HashMap;

public class RomanToInt {
    /**
     * 已完成
     *
     */
    public static int romanToInt(String s) {
        int len = s.length();
        int result = 0;
        int first = 0;
        int second = first + 1;
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        if (len == 1) {
            return map.get(String.valueOf(s.charAt(len - 1)));
        }
        while (first < second && second < len) {
            if (map.get(String.valueOf(s.charAt(first))) >= map.get(String.valueOf(s.charAt(second)))) {
                result = result + (map.get(String.valueOf(s.charAt(first))));
                first = second;
            } else {
                result = result + (map.get(String.valueOf(s.charAt(second))) - map.get(String.valueOf(s.charAt(first))));
                first = second + 1;
            }
            second = first + 1;
            if (first == len - 1 && second == len) {
                result = result + map.get(String.valueOf(s.charAt(len - 1)));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //MDCXCV
        System.out.println(romanToInt("D"));
    }
}
