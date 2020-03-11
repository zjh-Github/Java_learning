package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMedianSortedArrays {
    /**
     * 已完成
     *
     */
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays4(new int[]{1, 2}, new int[]{3, 4}));
    }

    //1,2,2,3,3,4,4,5,6,7
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1_length = nums1.length;
        int nums2_length = nums2.length;
        List<Integer> arrayList = new ArrayList();
        while (arrayList.size() != nums1.length + nums2.length) {
            if (nums1_length > 0) {
                arrayList.add(nums1[nums1_length - 1]);
                nums1_length--;
            }
            if (nums2_length > 0) {
                arrayList.add(nums2[nums2_length - 1]);
                nums2_length--;
            }
        }
        double[] array = new double[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }

        /*for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }*/
        double bias, min = array[0], max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }
        bias = 0 - min;
        double[] bucket = new double[(int) (max - min + 1)];
        Arrays.fill(bucket, 0);
        for (int i = 0; i < array.length; i++) {
            bucket[(int) (array[i] + bias)]++;
        }
        int index = 0, i = 0;
        while (index < array.length) {
            if (bucket[i] != 0) {
                array[index] = i - bias;
                bucket[i]--;
                index++;
            } else
                i++;
        }
        System.out.println(arrayList.size());
        if (array.length % 2 == 0) {
            int temp = (int) Math.ceil(array.length / 2);
            double num = (array[temp] + array[temp - 1]) / 2;
            return num;
        } else {
            return array[array.length / 2];
        }
    }

    public static double findMedianSortedArrays1(int[] nums1, int[] nums2) {
        int nums1_length = nums1.length;
        int nums2_length = nums2.length;
        List<Integer> arrayList = new ArrayList();
        while (arrayList.size() != nums1.length + nums2.length) {
            if (nums1_length > 0) {
                arrayList.add(nums1[nums1_length - 1]);
                nums1_length--;
            }
            if (nums2_length > 0) {
                arrayList.add(nums2[nums2_length - 1]);
                nums2_length--;
            }
        }
        Collections.sort(arrayList);
        double[] array = new double[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = (double) arrayList.get(i);
        }
        if (array.length % 2 == 0) {
            int index = (int) Math.ceil(array.length / 2);
            double num = (array[index] + array[index - 1]) / 2;
            return num;
        } else {
            return array[array.length / 2];
        }
    }

    public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        List<Integer> arrayList = new ArrayList();
        for (int i = 0; i < nums1.length; i++) {
            arrayList.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            arrayList.add(nums2[i]);
        }
        Collections.sort(arrayList);
        double[] array = new double[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = (double) arrayList.get(i);
        }
        if (array.length % 2 == 0) {
            int index = (int) Math.ceil(array.length / 2);
            double num = (array[index] + array[index - 1]) / 2;
            return num;
        } else {
            return array[array.length / 2];
        }
    }

    /**
     * @param nums1
     * @param nums2
     * @return
     */
    public static double findMedianSortedArrays3(int[] nums1, int[] nums2) {
        double[] array = new double[nums1.length + nums2.length];
        /*for (int i = 0; i < nums1.length; i++) {
            array[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            array[nums1.length + i] = nums2[i];
        }*/
        for (int i = 0; i < array.length; i++) {
            if (i < nums1.length)
                array[i] = nums1[i];
            if (i >= nums1.length)
                array[i] = nums2[i - nums1.length];
        }
        Arrays.sort(array);
        if (array.length % 2 == 0) {
            int index = (int) Math.ceil(array.length / 2);
            double num = (array[index] + array[index - 1]) / 2;
            return num;
        } else {
            return array[array.length / 2];
        }
    }

    public static double findMedianSortedArrays4(int[] nums1, int[] nums2) {
        double[] array = new double[nums1.length + nums2.length];
        for (int i = 0; i < array.length; i++) {
            if (i < nums1.length)
                array[i] = nums1[i];
            if (i >= nums1.length)
                array[i] = nums2[i - nums1.length];
        }
        Arrays.sort(array);
        if (array.length % 2 == 0) {
            int index = (int) Math.ceil(array.length / 2);
            double num = (array[index] + array[index - 1]) / 2;
            return num;
        } else {
            return array[array.length / 2];
        }
    }
}
