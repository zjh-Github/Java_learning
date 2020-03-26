package LeetCode.DailyProblem;

public class CompressString {
    /**
     *
     * 已完成
     */
    public static String compressString(String S) {
        StringBuilder stringBuilder = new StringBuilder();
        int len = S.length();
        int count = 1;
        if (len <= 1) {
            return S;
        }
        for (int i = 0; i < len - 1; i++) {

            if (String.valueOf(S.charAt(i)).equals(String.valueOf(S.charAt(i + 1)))) {
                count++;
            } else {
                System.out.println("ch:" + S.charAt(i));
                stringBuilder.append(S.charAt(i)).append(count);
                count = 1;
            }
            if (i == len - 2) {
                stringBuilder.append(S.charAt(len - 1)).append(count);
            }
            System.out.println("i:" + i);
        }
        return stringBuilder.length() < len ? stringBuilder.toString() : S;
    }

    public static void main(String[] args) {

        //a2b1c5a3
        System.out.println(compressString("aabcccccaa"));
    }
}
