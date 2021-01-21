package com.company;


import java.util.Scanner;

public class Main {
    public int reverse(int x) {
        int n;
        int m = x;
        long temp = 0;
        int count = 0;

        while (x != 0) {
            n = x % 10;
            count++;
            x = x / 10;
        }

        while (m != 0) {
            n = m % 10;
            temp = temp + n * (long) Math.pow(10, count - 1);
            count--;
            m = m / 10;
        }
        if (temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Main main = new Main();

        System.out.println(main.reverse(k));
    }
}