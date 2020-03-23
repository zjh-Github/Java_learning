package LeetCode;

public class IsPalindrome {
    /**
     * 已完成
     */
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        boolean flag = false;
        int i = 0, j = String.valueOf(Math.abs(x)).length() - 1;
        if (x >= 0 && x < 10)
            flag = true;
        if (x < 0) {
            flag = false;
        }
        while (i < j) {
            if (String.valueOf(x).charAt(i) == String.valueOf(x).charAt(j)) {
                i++;
                j--;
            } else {
                flag = false;
                break;
            }
            flag = true;
        }

        return flag;
    }
}
