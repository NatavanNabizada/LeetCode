package com.company;

import java.util.Scanner;

public class Main {

    public int mySqrt(int x) {
        return (int) Math.pow(x, 0.5);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        int n = sc.nextInt();


        System.out.println(main.mySqrt(n));
    }
}
