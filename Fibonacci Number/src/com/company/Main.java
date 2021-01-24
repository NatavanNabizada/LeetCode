package com.company;

import java.util.Scanner;

public class Main {

    // First Method of Solution
    public int fibFirstMethod(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    // Second Method of Solution
    public int fibSecondMethod(int n) {
        if (n == 1) {
            return 1;
        }
        int n1 = 0;
        int n2 = 1;
        int sum = 0;

        for (int i = 0; i < n - 1; ++i) {
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        int num = sc.nextInt();

        System.out.println(main.fibFirstMethod(num));

        System.out.println(main.fibSecondMethod(num));
    }
}
