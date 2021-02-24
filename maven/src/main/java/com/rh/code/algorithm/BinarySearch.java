package com.rh.code.algorithm;

/**
 * 二分查找(折半查找)
 */
public class BinarySearch {

    public int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
