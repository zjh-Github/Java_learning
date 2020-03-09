package LeetCode;



public class MaxProfit {

    public static int maxProfit(int[] prices) {
        int len = prices.length;
        int result = 0;
        for (int j = 0; j < len; j++) {
            int index = len - 1;
            while (j < index) {
                result = Math.max(result, prices[index] - prices[j]);
                index--;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        //7, 1, 5, 3, 6, 4

        int[] array = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(array));
    }
}
