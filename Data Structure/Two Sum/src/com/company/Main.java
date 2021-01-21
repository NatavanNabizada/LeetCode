package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        int target = sc.nextInt();
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(main.twoSum(arr, target)));
    }
}
