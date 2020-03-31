package LeetCode.DailyProblem;

import java.util.Arrays;

public class MinimumLengthEncoding {

    public static int minimumLengthEncoding(String[] words) {
        int len = words.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return words[0].length() + 1;
        }
        String result = "";
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < len; i++) {
            /*if (result.length() < words[i].length() && !result.equals("")) {
                String temp = result;
                result = words[i];
                words[i] = temp;
            }*/
            System.out.println(result + "、" + words[i]);
            if (result.contains(words[i]) && result.substring(result.length() - words[i].length(), result.length()).equals(words[i])) {
                continue;
            } else {
                result = words[i];
                stringBuffer.append(words[i] + "#");
            }
        }
        System.out.println(stringBuffer.toString());
        return stringBuffer.length();
    }

    public static void main(String[] args) {
        //"time", "me", "bell"
        // "me", "time"
        //"t"
        //"atime", "btime", "time"
        //"time", "time", "time", "time"
        //"time", "atime", "btime"
        String[] array = {"time", "alme", "btime"};
        Arrays.sort(array);
        System.out.println("result:" + minimumLengthEncoding(array));
        System.out.println("atime#btime#".contains("time"));
    }
}
