package SuanFa;

import java.util.ArrayList;
import java.util.HashMap;

public class subArray {

    public static void main(String[] args) {
        int[] nums = {3, 5, 2, -2, 3, 1};
//        System.out.println(subArraySum(nums,8));
//        System.out.println(subArraySum_second(nums,8));
        System.out.println(subArray(nums, 8));
        System.out.println(subArraySum_second(nums, 8));
    }

    static int subArray(int[] nums, int k) {
        int results = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == k)
                results++;
        }
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = i + 1; j < nums.length; j++) {
                temp += nums[j];
                arrayList.add(temp + nums[i]);
            }
        }
        for (int sum : arrayList) {
            System.out.print(sum + " ");
            if (sum == k)
                results++;
        }

        return results;
    }

    static int subArraySum(int[] nums, int k) {
        int size = nums.length;
        int answer = 0;
        //构造前缀和
        int[] sum = new int[size + 1];
        sum[0] = 0;
        for (int i = 0; i < size; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i] + " ");
            if (sum[i] == k)
                answer++;
        }
        //穷举所有子数组
       /* for (int i=0;i<=size;i++){
            for (int j=0;j<i;j++) {
                if (sum[i] - sum[j]==k)
                    answer++;
            }
        }*/
        return answer;
    }

    static int subArraySum_second(int[] nums, int k) {
        int size = nums.length;
        int answer = 0, sum0_i = 0;
        //map key:前缀和 -> value:前缀和出现的次数
        HashMap<Integer, Integer> preSum = new HashMap<>();
        //基础值
        preSum.put(0, 0);

        for (int i = 0; i < size; i++) {
            sum0_i += nums[i];
            //
            int sum0_j = sum0_i - k;
            if (preSum.containsKey(sum0_j)) {
                answer += preSum.get(sum0_j);
            }
            preSum.put(sum0_i, preSum.getOrDefault(sum0_i, 0) + 1);
        }
        return answer;
    }
}
