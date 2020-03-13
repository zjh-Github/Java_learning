package LeetCode;

import java.util.Arrays;

public class MajorityElement {
    /**
     * 以完成
     *
     */
    public static int majorityElement(int[] nums) {
        int count = 0;
        int result = 0;
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        Arrays.sort(nums);

        for (int i = 0; i < len - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count = i == len - 2 ? count + 2 : count + 1;
            } else {
                count++;
                if (count > len / 2) {
                    result = nums[i];
                    break;
                } else {
                    count = 0;
                }
            }
            if (count > len / 2) {
                result = nums[i];
                break;
            }
        }
        return result;
    }

    public static int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length];
    }

    public static void main(String[] args) {
        //3,2,3
        //1,1,1,1,1,1,2,2,2
        //2,2,1,1,1,2,2
        //2, 2, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3
        int[] array = {2, 2, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3};
        System.out.println(majorityElement1(array) + " ======");
        System.out.println(majorityElement(array) + " -----");
    }
}
