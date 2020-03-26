package LeetCode.PassedBy;

public class StrStr {
    public static int strStr(String haystack, String needle) {
        int result = 0;
        if (needle == null || needle.equals("")) {
            return result;
        }
        if (!haystack.contains(needle)) {
            return -1;
        }
        for (int i = 0; i < needle.length(); i++) {
            for (int j = 0; j < haystack.length(); j++) {
                if (String.valueOf(haystack.charAt(j)).equals(String.valueOf(needle.charAt(i)))) {
//                    String temp = haystack.substring(j, j + needle.length());
                    if (haystack.substring(j, j + needle.length()).equals(needle)) {
                        return j;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(strStr("helolollo", "ll"));
    }
}
