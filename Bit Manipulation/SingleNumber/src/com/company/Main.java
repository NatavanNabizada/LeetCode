package com.company;

import java.util.HashSet;

public class Main {
    public int singleNumber(int[] nums) {
        HashSet<Integer> al = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            al.add(nums[i]);
        }
        System.out.println(al);

        for (int set : al) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (set == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return set;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = new int[]{1, 2, 3};
        System.out.println(main.singleNumber(nums));
    }
}
