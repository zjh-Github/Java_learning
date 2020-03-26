package LeetCode.DailyProblem;



public class MaxProfit {

    /*
    * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
    * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
    * 注意你不能在买入股票前卖出股票。
    * */
    /**
     * 已完成
     *
     */
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
