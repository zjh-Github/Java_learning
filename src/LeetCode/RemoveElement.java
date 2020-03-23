package LeetCode;

import io.reactivex.internal.schedulers.ExecutorScheduler;

import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                count++;
                int j = i + 1;
                while (j < nums.length) {
                    if (nums[j] != val) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        System.out.println(nums[i]);
                        System.out.println(nums[j]);
                        break;
                    } else {
                        j++;
                    }
                }
            }
        }
        for (int j = 0; j < nums.length - count; j++) {
            System.out.println(nums[j]);
        }
        return nums.length - count;
    }

    public static void main(String[] args) {
        //[0,1,2,2,3,0,4,2]
        //2
        //4，5  4
        int[] aaray = {4, 5};
        System.out.println(removeElement(aaray, 4));
        Thread thread =new Thread();
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(() -> {
            System.out.println("Hello ThreadPool");
        });
        service.shutdown();
    }
}
