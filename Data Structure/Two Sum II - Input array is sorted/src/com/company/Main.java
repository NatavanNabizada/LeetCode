package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // the first method of solution
    public int[] twoSumFirstMethod(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target && i != j) {

                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return numbers;
    }

    //the second method of solution
    public int[] twoSumSecondMethod(int[] numbers, int target) {

        int low = 0, high = numbers.length - 1;

        while (low < high) {

            if (numbers[low] + numbers[high] == target) {
                return new int[]{low + 1, high + 1};
            } else if (numbers[low] + numbers[high] > target) {
                high--;
            } else if (numbers[low] + numbers[high] < target) {
                low++;
            }
        }
        return numbers;
    }


    public static void main(String[] args) {
        Main solution = new Main();
        Scanner sc = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4};
        int target = sc.nextInt();


        System.out.println(Arrays.toString(solution.twoSumFirstMethod(numbers, target)));

        System.out.println(Arrays.toString(solution.twoSumSecondMethod(numbers, target)));
    }
}
