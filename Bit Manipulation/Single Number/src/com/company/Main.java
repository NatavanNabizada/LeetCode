package com.company;

import java.util.HashSet;

public class Main {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        System.out.println(hs);

        for (int set : hs) {
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
        int[] nums = new int[]{4, 1, 2, 1, 2};
        System.out.println(main.singleNumber(nums));
    }
}
