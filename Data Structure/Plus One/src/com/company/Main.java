package com.company;

import java.util.Arrays;

public class Main {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4};
        Main main = new Main();

        System.out.println(Arrays.toString(main.plusOne(digits)));
    }
}
