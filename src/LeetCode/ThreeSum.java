package LeetCode;

import java.util.*;
import java.util.stream.Collectors;

public class ThreeSum {
    public static void main(String[] args) {
        //-1, 0, 1, 2, -1, -4
        //0,0,0,0
        //-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6
        //[-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6]
        //-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0
        //
        System.out.println(threeSum(new int[]{-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6}));

/*//        System.out.println(test(new int[]{1, 2, 3, 4, 1, 1, 1, 3, 4, 6, 7, 8, 9, 6}));
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        listA.add(-1);
        listA.add(1);
        listA.add(0);
        listB.add(0);
        listB.add(1);
        listB.add(0);
        System.out.println(listB);
        System.out.println(listA);
        if (listA.containsAll(listB)) {
            System.out.println("------------------");
        } else System.out.println("=================");*/
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> tempList;
        int len = nums.length;
        if (len < 3) {
            return list;
        }
        Arrays.sort(nums);
        for (int i = 0; i < len - 2; i++) {
            int first = i + 1;
            int second = first + 1;
            while (first < second) {
                if (second == nums.length) {
                    first++;
                    second = first + 1;
                }
                if (nums[i] + nums[first] + nums[second] == 0) {
                    tempList = new ArrayList<>();
                    tempList.add(nums[i]);
                    tempList.add(nums[first]);
                    tempList.add(nums[second]);
                    list.add(tempList);

                }
                second++;

                if (first == nums.length - 2) {
                    break;
                }

            }
        }

        return list;
    }

    public static int[] test(int[] array) {
        List<Integer> list = new ArrayList<>();
//        List uniqueList = list.stream().distinct().collect(Collectors.toList());
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        System.out.println(list);
        System.out.println(list.stream().distinct().collect(Collectors.toList()));
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(i) == list.get(j)) {
                    list.remove(j);
                }
            }
        }
        System.out.println(list);
        return array;
    }

    public static List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums == null || nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            //减枝
            if (nums[i] > 0) {
                break;
            }
            //去重
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] + nums[i] < 0 || (left > i + 1 && nums[left] == nums[left - 1])) {
                    left++;
                } else {
                    if (nums[left] + nums[right] + nums[i] > 0 || (right < nums.length - 1 && nums[right] == nums[right + 1])) {
                        right--;
                    } else {
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(nums[i]);
                        list.add(nums[left++]);
                        list.add(nums[right--]);
                        result.add(list);
                    }
                }
            }
        }
        return result;
    }

}
