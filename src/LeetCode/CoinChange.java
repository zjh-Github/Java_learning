package LeetCode;

import java.util.Arrays;

public class CoinChange {
    /**
     * 未完成
     */
    public static int coinChange(int[] coins, int amount) {
        int len = coins.length;
        int result = 0;
        int[][] dp = {{0, 0}};
        Arrays.sort(coins);
        if (amount == 0) {
            return 0;
        }
        if (coins[0] > amount) {
            return -1;
        } else {
            for (int i = coins.length - 1; i >= 0; i--) {
//                result = coinCh(coins, amount);
            }

            return result;
        }

    }

    public static int coinCh(int[] coins, int amount,int size) {
        int temp = 0;
        int result = 0;
        int count = 0;
        Arrays.sort(coins);
        while ( size > 0) {
            for (int i = size-1; i >= 0; ) {
                if (amount > temp) {
                    temp += coins[i];
                    count++;
                }
                if (amount < temp) {
                    temp -= coins[i];
                    count--;
                    i--;
                }
                if (amount == temp) {
                    System.out.println("count:" + count);
                    result = result == 0 ? count : Math.min(result, count);
                    count = 0;
                    break;
                }
            }
            size--;
        }
        System.out.println("temp:" + temp);
        return amount == temp ? result : -1;
    }

    public static void main(String[] args) {
        /*
         * [186,419,83,408]
         * 6249
         * */
        int[] array = {186, 419, 83, 408};
        int count = 6249;
        System.out.println(coinCh(array, count,array.length));
    }
}
