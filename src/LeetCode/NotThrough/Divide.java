package LeetCode.NotThrough;

public class Divide {
    public static int divide(int dividend, int divisor) {
        int result = 0;
        long temp = 0;
        int count;
        if (dividend == 0) {
            return result;
        }
        long div = dividend;
        if (div <= Integer.MIN_VALUE) {
            div = 0 - div;
        } else {
            div = Math.abs(div);
        }
        if ((divisor < 0 && dividend < 0) || (dividend > 0 && divisor > 0)) {
            count = 1;
            divisor = Math.abs(divisor);
        } else {
            divisor = Math.abs(divisor);
            count = -1;
        }
        if (div == Integer.MAX_VALUE && divisor == 1) {
            return Integer.MAX_VALUE;
        }
        System.out.println("div:" + div);
        while (temp <= div) {
            temp += divisor;
            result++;
        }
        System.out.println("result:" + result + "、" + temp);
        result -= 1;
        if (temp > Integer.MAX_VALUE ) return Integer.MAX_VALUE;
        temp = 0 - temp;
        if (temp < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        System.out.println("count:" + count);
        if (count < 0) {
            result = 0 - result;
        }
        return result;
    }

    public static void main(String[] args) {
        //-2147483648
        //-1
        System.out.println(divide(-2147483648, 1));
//        System.out.println(Integer.MIN_VALUE);
    }
}
