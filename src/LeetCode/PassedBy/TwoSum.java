package LeetCode.PassedBy;

import java.util.*;

public class TwoSum {
    /**
     * 已完成
     */
    public static void main(String[] args) throws Exception {
        int[] array = {2, 7, 11, 15};
//        System.out.println(twoSum(array,9));
        twoSum2(array, 9);
        System.out.println(twoSum2(array, 9));
    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static int[] twoSum2(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < len; i++) {
            hashMap.put(nums[i], i);
        }

        for (int j = 0; j < len; j++) {
            int temp = target - nums[j];
            if (hashMap.containsKey(temp) && hashMap.get(temp) != j)
                return new int[]{j, hashMap.get(temp)};
        }
        return null;
    }
}
