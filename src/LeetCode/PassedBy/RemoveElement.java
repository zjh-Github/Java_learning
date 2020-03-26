package LeetCode.PassedBy;

import io.reactivex.internal.schedulers.ExecutorScheduler;

import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RemoveElement {
    /**
     * 已完成
     */
    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        if (len == 0) {
            return len;
        }
        if (len == 1 && nums[0] == val) {
            return len - 1;
        }
        int i = 0;
        int j = len - 1;
        int count = 0;
        while (i < len && i <= j) {
            if (nums[i] == val) {
                count++;
                if (nums[j] != val) {
                    nums[i] = nums[j];
                    nums[j] = val;
                    i++;
                }
                j--;

            } else {
                i++;
            }
        }
        return len - count;
    }

    public static void main(String[] args) {
        //[0,1,2,2,3,0,4,2]
        //2
        //4，5  4
        int[] array = {2};
        int len = removeElement(array, 2);
        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.println("array:" + array[i]);
        }
        for (int a : array
        ) {
            System.out.println("a:" + a);
        }
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(() -> {
            System.out.println("Hello Thread Pool");
        });
        service.shutdown();
    }
}
