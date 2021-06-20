package com.company;

import java.math.BigInteger;

public class Main {

    public String addStrings(String num1, String num2) {
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        BigInteger sum = n1.add(n2);
        return sum.toString();
    }

    public static void main(String[] args) {
        Main main = new Main();
        String str1 = "145";
        String str2 = "227";
        System.out.println(main.addStrings(str1, str2));
    }
}
