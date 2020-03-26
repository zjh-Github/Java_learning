package LeetCode.PassedBy;

public class RemoveDuplicates {
    /**
    *
    * 已完成
    */
    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len <= 1) {
            return len;
        }
        int i = 1;
        int result = 0;
        while (i < len) {
            if (nums[i] != nums[result]) {
                result++;
                nums[result] = nums[i];
            }
            i++;
        }
        return result + 1;
    }

    public static void main(String[] args) {
        //0,0,1,1,1,2,2,3,3,4
        int[] array = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len = removeDuplicates(array);
        System.out.println(len);
        for (int a : array) {
            System.out.println("array:" + a);
        }
    }
}
