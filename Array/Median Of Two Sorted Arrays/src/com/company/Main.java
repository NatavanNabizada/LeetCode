package com.company;

import java.util.Arrays;

public class Main {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];

        for (int i = 0; i < nums1.length; i++) {
            arr[i] = nums1[i];
        }

        for (int i = nums1.length; i < arr.length; i++) {
            arr[i] = nums2[i - nums1.length];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Arrayin sonu");
        System.out.println("Listenmish Array");

        Arrays.sort(arr);
        if (arr.length % 2 == 1) {
            return arr[arr.length / 2];
        } else {
            return (double) (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        System.out.println(main.findMedianSortedArrays(nums1, nums2));
    }
}