package LeetCode.DailyProblem;

public class CanThreePartsEqualSum {
    /*
     * 给你一个整数数组 A，只有可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false。
     * 形式上，如果可以找出索引 i+1 < j 且满足 (A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1])
     * 就可以将数组三等分
     * */

    /**
     * 已完成
     *
     */
    public static boolean canThreePartsEqualSum(int[] A) {
        int len = A.length;
        int sum = 0;
        int num = 0;
        int count = 0;
        for (int k = 0; k < len; k++) {
            sum += A[k];
        }
        if (sum % 3 != 0) {
            return false;
        }
        /*while (j < len + 1) {
            int firstNum = 0;
            int secondNum = 0;
            int thirdNum = 0;
//            System.out.println("i:" + i);
//            System.out.println("j:" + j);
            if (j > len - 1) {
                i++;
                j = i + 2;
                ;
            }
//            System.out.println(firstNum + "、" + secondNum + "、" + thirdNum+"############");
            int first = i;
            int second = i + 1;
            int third = j;
            while (first >= 0) {
                firstNum = A[first] + firstNum;
//                System.out.println("firstNum:" + firstNum);
                first--;
            }
            while (second < third) {
                secondNum = A[second] + secondNum;
                second++;
            }
//            while (third < len) {
//                thirdNum = A[third] + thirdNum;
//                third++;
//            }
            thirdNum = sum - firstNum - secondNum;
            System.out.println(firstNum + "、" + secondNum + "、" + thirdNum);
            if (firstNum - secondNum == 0 && thirdNum == secondNum) {
                return true;
            }
            j++;
        }*/
        for (int k = 0; k < len - 1; k++) {
            num += A[k];
            if (num == sum / 3) {
                count++;
                if (count == 2) {
                    return true;
                }
                num = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //0,2,1,-6,6,-7,9,1,2,0,1
        //0,2,1,-6,6,7,9,-1,2,0,1
        //3,3,6,5,-2,2,5,1,-9,4
        //[12,-4,16,-5,9,-3,3,8,0]
        int[] array = {12, -4, 16, -5, 9, -3, 3, 8, 0};
        System.out.println(canThreePartsEqualSum(array));
    }
}
