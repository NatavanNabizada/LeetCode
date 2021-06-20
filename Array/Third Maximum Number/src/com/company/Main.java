package com.company;

import java.util.Collections;
import java.util.HashSet;

public class Main {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        System.out.println(set);

        if (set.size() >= 3) {
            for (int i = 0; i < 2; i++) {
                int max = Collections.max(set);
                set.remove(max);
            }
        } else {
            return Collections.max(set);
        }
        return Collections.max(set);
    }

    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = new int[]{1, 2, 3};
        System.out.println(main.thirdMax(nums));
    }
}
