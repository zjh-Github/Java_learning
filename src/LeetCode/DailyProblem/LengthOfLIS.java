package LeetCode.DailyProblem;

public class LengthOfLIS {
    /**
     *
     * 已完成
     */
    public static int lengthOfLIS(int[] nums) {
        int count = 1;
        int temp = 1;
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int left = 0;
        int right = left + 1;
        int res = nums[left];
        int pre = res;
        while (left < right && right < len) {
            if (left == len - 1) break;
            if (res < nums[right]) {
                pre = res;
                res = nums[right];
                temp = temp + 1;
            } else if ((right - 2 >= 0) && nums[right] > pre) {
                pre = res;
                res = nums[right];
            }
            right++;
            if (right == len) {
                left++;
                right = left + 1;
                count = Math.max(count, temp);
                temp = 1;
                res = nums[left];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //10,9,2,5,3,7,101,18
        //1,7,2,5,9,4,8
        //[1,3,6,7,9,4,10,5,6]
        int[] array = {1, 3, 6, 7, 9, 4, 10, 5, 6};
        System.out.println(lengthOfLIS(array));
    }
}
