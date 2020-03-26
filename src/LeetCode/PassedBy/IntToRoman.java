package LeetCode.PassedBy;

import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class IntToRoman {
    /**
     * 已完成
     *
     */
    public static void main(String[] args) {
        System.out.println(intToRoman(1994));

    }

    //枚举法，真、简单粗暴
    public static String intToRoman(int num) {
        String result = "";
        if (num < 1 || num > 3999)
            return result;
        String[] roman1 = new String[]{"", "M", "MM", "MMM"};
        String[] roman2 = new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] roman3 = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] roman4 = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        result = roman1[(int) Math.floor(num / 1000)] + roman2[(int) Math.floor((num % 1000) / 100)] + roman3[(int) Math.floor((num % 100) / 10)] + roman4[num % 10];

        return result;
    }
}
