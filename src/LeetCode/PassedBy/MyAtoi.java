package LeetCode.PassedBy;

import java.util.HashMap;
import java.util.Map;

public class MyAtoi {
    /**
     * 已完成
     *
     */
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE + "、" + Integer.MIN_VALUE);
        System.out.println(myAtoi("2000000000000000000000000000000"));

    }

    public static int myAtoi(String str) {
        String result = "";
        int flag = 1;
        String string = str.trim();
        if (string.equals("") || string.equals("-") || string.equals("+")) {
            return 0;
        }
        if (string.charAt(0) == '-') {
            flag = -1;
        }
        if (string.charAt(0) == '-' || string.charAt(0) == '+') {
            string = string.substring(1, string.length());
        }
        for (int i = 0; i < string.length(); i++) {
            String temp = "";
            if (string.charAt(i) >= '0' && string.charAt(i) <= '9') {
                temp = String.valueOf(string.charAt(i));
            }
            result = result.concat(temp);
            if (temp.equals("")) {
                if (result.equals(""))
                    return 0;
                else break;
            }
            if (Long.valueOf(result) * flag >= Integer.MAX_VALUE) {
                result = String.valueOf(Integer.MAX_VALUE);
                break;
            }
            if (Long.valueOf(result) * flag <= Integer.MIN_VALUE) {
                result = String.valueOf(Integer.MIN_VALUE);
                break;
            }
        }

        return Integer.valueOf(result) * flag;
    }
}
