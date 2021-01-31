package com.company;

public class Main {
    public boolean isPowerOfThree(int n) {
        return (n > 0 && (Math.pow(3, 19)) % n == 0);
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.isPowerOfThree(120));
    }
}
