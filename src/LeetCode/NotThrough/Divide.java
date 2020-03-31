package LeetCode.NotThrough;

public class Divide {
    public static int divide(int dividend, int divisor) {
        long result = 0;
        if ((dividend == Integer.MIN_VALUE && divisor == -1) || (dividend == Integer.MAX_VALUE && divisor == 1)) {
            return Integer.MAX_VALUE;
        }
        for (int i = 0; i < 32; i++) {

        }
        return (int) result;
    }

    public static String binaryToDecimal(int n) {
        int result = 0;
        for (int i = 31; i >= 0; i--) {
            System.out.print(n >>> i & 1);
            result = n >>> i & 1;
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        //-2147483648
        //-1

        System.out.println("----------");
        System.out.println(-8 / 7);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}
