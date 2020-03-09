package LeetCode;

import java.util.*;

public class ThreeSumClosest {
    public static void main(String[] args) {

        //-1,2,1,-4
        //1,1,1,1
        //-94,-92,31,60,-31,-5,0,-48,-30,96,-93,47,56,-45,-77,-56,-10,43,63,90,-100,65,-80,94,98,65,-56,-45,-87,78,47,99,47,-64,77,-70,81,76,80,36,23,-99,-79,-91,66,95,-1,-1,33,24,-51,-86,95,-58,-96,84,61,97,-58,-37,22,-68,24,-4,-67,-67,88,82,-79,56,-100,58,-54,-32,-74,-68,67,18,-71,-48,83,-21,-99,51,-8,-16,12,34,-60,-44,-35,-62,14,-59,-34,89,-53,53,-78,94,77,-61,-49,20,-27,8,76,-96,-16,-6,93,-33,-36,-62,-22,-67,-30,19,54,-20,-36,-8,-31,-67,24,31,0,28,16,17,-11,-69,-43,-53,93,44,-34,73,-89,45,-46,63,6,-49,47,93,82,33,-14,-20,25,-1,-48,-56,47,-49,43,4,-68,37,86,-6,-56,91,-24,-43,40,40,-51,-58,-64,-56,84,-22,-81,32,55,32,43,-13,-100,-15,66,61,85,-81,57,20,64,-57,-68,8,-60,65,97,3,33,-68,40,83,-79,38,32,-41,67,-72,-54,22,54,-49]
        //121
//        System.out.println(threeSumClosest(new int[]{-94,-92,31,60,-31,-5,0,-48,-30,96,-93,47,56,-45,-77,-56,-10,43,63,90,-100,65,-80,94,98,65,-56,-45,-87,78,47,99,47,-64,77,-70,81,76,80,36,23,-99,-79,-91,66,95,-1,-1,33,24,-51,-86,95,-58,-96,84,61,97,-58,-37,22,-68,24,-4,-67,-67,88,82,-79,56,-100,58,-54,-32,-74,-68,67,18,-71,-48,83,-21,-99,51,-8,-16,12,34,-60,-44,-35,-62,14,-59,-34,89,-53,53,-78,94,77,-61,-49,20,-27,8,76,-96,-16,-6,93,-33,-36,-62,-22,-67,-30,19,54,-20,-36,-8,-31,-67,24,31,0,28,16,17,-11,-69,-43,-53,93,44,-34,73,-89,45,-46,63,6,-49,47,93,82,33,-14,-20,25,-1,-48,-56,47,-49,43,4,-68,37,86,-6,-56,91,-24,-43,40,40,-51,-58,-64,-56,84,-22,-81,32,55,32,43,-13,-100,-15,66,61,85,-81,57,20,64,-57,-68,8,-60,65,97,3,33,-68,40,83,-79,38,32,-41,67,-72,-54,22,54,-49}, 1));
        System.out.println(threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        List<Integer> list = new ArrayList<>();
        List<Integer> arrayList = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        /*for (int i = 0; i < len - 2; i++) {
            int left = i + 1;
            int right = len - 1;
            while (left < right) {
                if (nums[left] + nums[right] + nums[i] < 0 || (left > i + 1 && nums[left] == nums[left - 1])) {
                    left++;
                } else {
                    if (nums[left] + nums[right] + nums[i] > 0 || (right < nums.length - 1 && nums[right] == nums[right + 1])) {
                        right--;
                    } else {
                        list.add(Math.abs(target - (nums[i] + nums[left] + nums[right])));
                        arrayList.add((nums[i] + nums[left] + nums[right]));
                    }
                }
            }

        }*/
        for (int i = 0; i < len - 2; i++) {
            int left = i + 1;
            int right = len - 1;
            while (left < right) {
                list.add(Math.abs(target - (nums[i] + nums[left] + nums[right])));
                arrayList.add((nums[i] + nums[left] + nums[right]));
                right--;

            }
        }
/*
[1, 4, 5, 2]
[2, -3, -4, -1]
 */
        System.out.println(list);
        int temp = list.get(0), flag = 0;
        for (int i = 0; i < list.size(); i++) {
            if (temp > list.get(i)) {
                temp = list.get(i);
                flag = i;
            }
        }
        System.out.println(arrayList);
        return arrayList.get(flag);
    }
}
