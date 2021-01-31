package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {
    //First Solution
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == 2 * arr[j] && i != j) {
                    return true;
                }
            }
        }
        return false;
    }

    //Second Solution
    public boolean checkIfExistSecondWay(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int n : arr) {
            if ((set.contains(2 * n)) || (n % 2 == 0 && set.contains(n / 2))) {
                return true;
            }
            set.add(n);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        Main main = new Main();
        System.out.println(main.checkIfExist(arr));
        System.out.println(main.checkIfExistSecondWay(arr));
    }
}
