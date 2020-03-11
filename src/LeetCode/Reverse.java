package LeetCode;


public class Reverse {
    /**
     * 已完成
     *
     */
    public static void main(String[] args) {
        System.out.println(reverse(10)); //-2147483412 1534236469
    }

    public static int reverse(int x) {
        long result = 0;
        int len = String.valueOf(Math.abs(x)).length();
        if (x / 10 == 0) {
            return x;
        }
        for (int i = 1; i <= len; i++) {
            result += (((long) (x % Math.pow(10, i))) / (int) Math.pow(10, i - 1)) * (int) Math.pow(10, len - i);
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) return 0;
        }
        return (int) result;
    }
}
