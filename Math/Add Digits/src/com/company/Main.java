package com.company;

import java.util.Scanner;

public class Main {
    public int addDigits(int num) {
        return ((num / 10) == 0) ? num : addDigits((num / 10) + (num % 10));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        int num = sc.nextInt();
        System.out.println(main.addDigits(num));
    }
}
