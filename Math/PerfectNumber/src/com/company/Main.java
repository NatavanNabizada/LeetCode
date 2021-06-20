package com.company;

public class Main {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int num = 15;
        System.out.println(main.checkPerfectNumber(num));
    }
}
