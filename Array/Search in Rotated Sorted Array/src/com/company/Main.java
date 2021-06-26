package com.company;

public class Main {
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = new int[]{1, 2, 3, 4, 6, 7};
        System.out.println(main.search(nums, 7));
    }
}
