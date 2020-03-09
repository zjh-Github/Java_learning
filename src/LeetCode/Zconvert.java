package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zconvert {
    public static void main(String[] args) {
        System.out.println(convert1("123456789ABCDEFGHIJ", 4));


    }

    //LCIRETOESIIGEDHN
    //LCIRLTDSRGLECDIHRN
    //LCIRLECDIHRN
    public static String convert(String s, int numRows) {

        StringBuffer stringBuffer = new StringBuffer();
        Map<Integer, Character> map = new HashMap<>();
        if (numRows < 2 || numRows >= s.length()) return s;
        int num = numRows * 2 - 2;
        for (int i = 0; i < numRows; i++) {
            stringBuffer.append(s.charAt(i));
        }
        return String.valueOf(stringBuffer);

    }

    public static String subString(String str, String strStart, String strEnd) {

        /* 找出指定的2个字符在 该字符串里面的 位置 */
        int strStartIndex = str.indexOf(strStart);
        int strEndIndex = str.indexOf(strEnd);

        /* index 为负数 即表示该字符串中 没有该字符 */
        if (strStartIndex < 0) {
            return "字符串 :---->" + str + "<---- 中不存在 " + strStart + ", 无法截取目标字符串";
        }
        if (strEndIndex < 0) {
            return "字符串 :---->" + str + "<---- 中不存在 " + strEnd + ", 无法截取目标字符串";
        }
        /* 开始截取 */
        String result = str.substring(strStartIndex, strEndIndex).substring(strStart.length());
        return result;
    }

    public static String convert1(String s, int numRows) {
        StringBuffer stringBuffer = new StringBuffer();
        int j;
        if (numRows < 2 || numRows >= s.length()) return s;
        for (int i = 0; i < numRows; i++) {
            j = i;
            boolean flag = true;
            while (j <= s.toCharArray().length - 1) {
                stringBuffer.append(s.charAt(j));
                if (i == 0 || i == numRows - 1) {
                    j = j + 2 * (numRows - 1);
                } else {
                    if (flag) {
                        j = j + 2 * (numRows - 1 - i);
                        flag = false;
                    } else {
                        j = j + 2 * i;
                        flag = true;
                    }
                }
            }
        }
        return stringBuffer.toString();
    }

}
