package LeetCode;

import java.util.HashMap;
import java.util.Stack;

public class IsValid {

    /**
     *
     * 已完成
     */
    public static boolean isValid(String s) {
        int len = s.length();
        HashMap<String, String> map = new HashMap<>();
        map.put("(", ")");
        map.put("{", "}");
        map.put("[", "]");
        if (len == 0) {
            return true;
        }
        if (!map.containsKey(String.valueOf(s.charAt(0))) || len % 2 != 0) {
            return false;
        }
        Stack<String> stack = new Stack();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(String.valueOf(s.charAt(0)))) {
                stack.push(String.valueOf(s.charAt(i)));
            } else if (!map.get(stack.pop()).equals(String.valueOf(s.charAt(i)))) {
                return false;
            }
        }
        return stack.size() == 0;
    }

    public static boolean isLeft(String str) {
        switch (str) {
            case "(":
            case "{":
            case "[":
                return true;
            default:
                return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(isValid("("));
    }
}
