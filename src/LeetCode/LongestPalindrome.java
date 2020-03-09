package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindrome {

    public static void main(String[] args) {

        System.out.println(longestPalindrome2(" s fd af s hda "));
    }

    public static String longestPalindrome(String s) {
        int flag = 0;

        StringBuffer string = new StringBuffer(s).reverse();

        char[] chars = new char[s.length()];
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
//            chars[i] = s.charAt(i);
            list.add(s.charAt(i));
        }

        System.out.println(string + "__");
        return String.valueOf(string);
    }

    public static String longestPalindrome1(String s) {
        String resutl = "";
        StringBuffer s1 = new StringBuffer(s).reverse();
        StringBuffer s2 = new StringBuffer();
        s2.append(s);
        s2.append(s1);
        int i = 0, j = s2.length();

        for (int k = 0; k < s2.length(); k++) {
            while (i >= 0 && j < s2.length() && s2.charAt(i) == s2.charAt(j)) {
                j--;
                i++;
            }
            String string1 = s2.substring(i, j - i);
            String string2 = s2.substring(i + 1, j - i - 1);
            resutl = resutl.length() > s1.length() ? resutl : string1;
            resutl = resutl.length() > s1.length() ? resutl : string2;
        }

        return resutl;
    }

    /**
     * @param s
     * @return
     */
    public static String longestPalindrome2(String s) {

        if (s.length() <= 1)
            return s;
        int sum = 1;
        String SubString = s.substring(0, 1);
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j) && (i - j <= 2 || dp[j + 1][i - 1])) {
                    dp[j][i] = true;
                    if (i - j + 1 > sum) {
                        sum = i - j + 1;
                        SubString = s.substring(j, i + 1);
                    }
                }
            }
        }
        return SubString;
    }

}
