package com.mamba.other.demo.excel_1_to_26;

/**
 * @version 1.0
 * @author: JoeBig7
 * @date: 2019/11/27 21:05
 * @description
 */
public class Solution {

    public static String getExcelStr(int index) {
        String[] base = new String[]{"Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};


        String str = "";
        while (index > 0) {
            int pos = index % 26;
            str = base[pos] + str;
            index = (index - 1) / 26;
        }

        return str;
    }

    public static void main(String[] args) {
         System.out.println(getExcelStr(25));
        System.out.println(getExcelStr(59595959));
    }

}