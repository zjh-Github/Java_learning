package LeetCode;

import java.util.Vector;

public class Muilply {
    public static void main(String[] args) {

    }

    /*public static String mutilply(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        String str;
        Vector<Integer> res = new Vector<>(m + n, 0);
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (num1[i] - '0') * (num2[j] - '0');
                int p1 = i + j, p2 = i + j + 1;
                int sum = mul + res[p2];
                res[p2] = sum % 10;
                res[p1] += sum / 10;
            }
            int i = 0;
            while (i < res.size() && res[i] == 0) {
                i++;
            }
                for (; i < res.size(); i++)
                    str.push_back('0' + res[i]);

        }
        return str.length() == 0 ? "0" : str;
    }*/
}
