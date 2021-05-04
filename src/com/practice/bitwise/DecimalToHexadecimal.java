package com.practice.bitwise;

import javafx.beans.binding.When;

public class DecimalToHexadecimal {

    public static void printHexString(int input) {

        char[] hexArray = new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C', 'D','E'};
        String output = "" ;

        while(input > 0) {
            int remainder = input %16;
            output = hexArray[remainder]+output;
            input = input/16;
        }
        System.out.println(output);
    }

    public static void main(String... args) {
        printHexString(11);
    }
}
