package LeetCode;

public class LongestCommonPrefix {
    /**
     * 已完成
     *
     */
    public static void main(String[] args) {
        //"dog","racecar","car"
        //"flower", "flow", "flight"
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        String result = "", var = "";
        int len = strs.length;
        if (len == 0) {
            return result;
        }
        if (len == 1) {
            return strs[0];
        }
/*        for (int j = 0; j < len; j++) {
            if (strs[j].length() < strs[in].length()) {
                in = j;
            }
        }*/
        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            for (int j = 0; j < len; j++) {
                if (ch == strs[j].charAt(i)) {
                    var = String.valueOf(ch);
                } else
                    return result;
            }
            result = result + var;
        }
        return result;
    }
}
