package LeetCode;

public class GcdOfStrings {
    /**
    * 已完成
    *
    */
    public static String gcdOfStrings(String str1, String str2) {
        int str1Len = str1.length();
        int str2Len = str2.length();
        if (str1.equals(str2)) {
            return str1;
        }
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        } else {
            int maxLen;
            int minLen;
            String minStr;
            if (str1Len >= str2Len) {
                minLen = str2Len;
                maxLen = str1Len;
                minStr = str2;
            } else {
                minLen = str1Len;
                maxLen = str2Len;
                minStr = str1;
            }
            while (minLen != 0) {
                int temp = maxLen % minLen;
                maxLen = minLen;
                minLen = temp;
            }
            return minStr.substring(0, maxLen);
        }

    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("WRTHHGJ", "HLKLK"));

        System.out.println("ABCABC".substring(0, 2));
    }
}
