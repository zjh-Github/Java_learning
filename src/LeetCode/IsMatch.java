package LeetCode;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

public class IsMatch {
    public static void main(String[] args) {
        String s = "a";
        System.out.println("aaa".matches(s));
        System.out.println(isMatch("aa", "*."));
    }

    public static boolean isMatch(String s, String p) {
        boolean flag = false;
        if (p.contains(".") && p.length() < s.length() && !p.contains("*")) {
            flag = false;
        }
        return flag;
    }
}
