package com.company;

public class Main {

    public boolean isPowerOfTwo(int n) {
        //First Solution
        if (n == 0) {
            return false;
        }
        while (n != 1) {
            if (n % 2 != 0) {
                return false;
            }
            n = n / 2;
        }
        return true;

        // Second Solution
        // return (n>0 && Math.pow(2,31)%n==0);
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.isPowerOfTwo(5));
    }
}
