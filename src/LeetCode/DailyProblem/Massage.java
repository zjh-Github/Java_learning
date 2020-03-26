package LeetCode.DailyProblem;

public class Massage {


    /**
     * 已完成 30%
     * 动态规划
     */
    public static int massage(int[] nums) {
        int len = nums.length;
        int result = 0;
        if (len == 0) {
            return result;
        }
        if (len == 1) {
            return nums[0];
        }
        int[][] dp = new int[len + 1][2];
        for (int i = 1; i <= len; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
            dp[i][1] = dp[i - 1][0] + nums[i - 1];
        }

        return Math.max(dp[len][0], dp[len][1]);
    }

    public static int massage1(int[] nums) {
        int len = nums.length;
        int result = 0;
        if (len == 0) {
            return result;
        }
        if (len == 1) {
            return nums[0];
        }
        int[][] dp = new int[len + 1][2];
        for (int i = 0; i <= len - 1; i++) {
            dp[i + 1][0] = Math.max(dp[i][0], dp[i][1]);
            dp[i + 1][1] = dp[i][0] + nums[i];
        }

        return Math.max(dp[len][0], dp[len][1]);
    }

    public static void main(String[] args) {
        //2,1,4,5,3,1,1,3
        //1,2,3,1
        //2,7,9,3,1
        int[] array = {2,7,9,3,1};
        System.out.println(massage(array));
        System.out.println(massage1(array));
    }
}
