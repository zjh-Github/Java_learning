package LeetCode;

import java.util.*;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring2("bbbbbbbbbbbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int count = 0;
        int num = 1;
        char[] ch = s.toCharArray();
        HashMap<Integer, Character> map = new HashMap<>();
        if (s.length() > 0) {
            for (int i = 0; i < ch.length; i++) {
                for (int j = 0; j < ch.length; j++) {
                    if (!map.containsValue(ch[j])) {
                        map.put(i, ch[j]);
                        count++;
                        System.out.println(map.values());
                        num = (num > count ? num : count);
                    } else {
                        num = (num > count ? num : count);
                        map.clear();
                        count = 1;
                    }
                }
            }
        } else
            num = 0;
        return num;
    }

    public static int lengthOfLongestSubstring1(String s) {
        int i = 0;
        int flag = 0;
        int length = 0;
        int result = 0;
        while (i < s.length()) {
            int pos = s.indexOf(s.charAt(i), flag);
            if (pos < i) {
                if (length > result) {
                    result = length;
                }
                if (result >= s.length() - pos - 1) {
                    return result;
                }
                length = i - pos - 1;
                flag = pos + 1;
            }
            length++;
            i++;
        }
        return length;
    }

    public static int lengthOfLongestSubstring2(String s) {
        int num = 0, i = 0, j = 0;
        Set<Character> list = new HashSet<>();
        while (i < s.length() && j < s.length()) {
            if (!list.contains(s.charAt(j))) {
                list.add(s.charAt(j++));
                num = Math.max(num, j - i);
            } else {
                list.remove(s.charAt(i++));
            }
        }
        return num;
    }

    public static int lengthOfLongestSubstring3(String s) {
        int result = 0;

        return result;
    }
}

