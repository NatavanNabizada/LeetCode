package com.company;

public class Main {
    public boolean isPowerOfFour(int n) {
        if (n < 1) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        while (n > 1) {
            if (n % 4 != 0) {
                return false;
            }
            n = n / 4;
        }
        return true;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.isPowerOfFour(123));
    }
}
