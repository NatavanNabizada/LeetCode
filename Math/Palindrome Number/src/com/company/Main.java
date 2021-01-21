package com.company;

import java.util.Scanner;

public class Main {
    public boolean isPalindrome(int x) {
        int m = x;
        int temp = 0;

        while (x != 0) {
            temp = temp * 10 + x % 10;
            x = x / 10;
        }

        return m == temp && m >= 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Main main = new Main();
        System.out.println(main.isPalindrome(x));
    }
}
