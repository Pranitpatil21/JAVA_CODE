/*
  Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order.
  Merge them in sorted order without using any extra space. Modify arr1 so that it
 contains the first N elements and modify arr2 so that it contains the last M
 elements.
 Example 1:
 Input:
  n = 4, arr1[] = [1 3 5 7]
  m = 5, arr2[] = [0 2 6 8 9]
 Output:
  arr1[] = [0 1 2 3]
  arr2[] = [5 6 7 8 9] */

import java.util.Arrays;
import java.util.jar.JarEntry;

class Assignment {
    public static void merge(int[] arr1, int[] arr2, int n, int m) {
        int i = 0;
        int j = n - 1;
        while (j >= 0 && i < m) { // Doing swapping of first array and second array
            if (arr1[j] >= arr2[i]) {
                int temp = arr1[j];
                arr1[j] = arr2[i];
                arr2[i] = temp;
            }
            i++;
            j--;
        }
        for (j = 0; j < arr1.length; j++) { // Sorting first array
            for (i = 1; i < arr1.length; i++) {
                if (arr1[i - 1] > arr1[i]) {
                    int temp = arr1[i - 1];
                    arr1[i - 1] = arr1[i];
                    arr1[i] = temp;
                }
            }
        }
        for (j = 0; j < arr2.length; j++) { // Sorting Second Array
            for (i = 1; i < arr2.length; i++) {
                if (arr2[i - 1] > arr2[i]) {
                    int temp = arr2[i - 1];
                    arr2[i - 1] = arr2[i];
                    arr2[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 3, 5, 7 };
        int[] arr2 = new int[] { 0, 2, 6, 8, 9 };
        merge(arr1, arr2, 4, 5);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
/*
 * Problem Statement 4:
 * Given an array arr[] of size N, check if it is sorted in non-decreasing order
 * or not.
 * Example 1:
 * Input:
 * N = 5
 * arr[] = {10, 20, 30, 40, 50}
 * Output: 1
 * 
 * Explanation: The given array is sorted.
 * Example 2:
 * Input:
 * N = 6
 * arr[] = {90, 80, 100, 70, 40, 30}
 * Output: 0
 * Explanation: The given array is not sorted.
 * Expected Time Complexity: O(N)
 * Expected Auxiliary Space: O(1)
 * Constraints:
 * 1 ≤ N ≤ 10^5
 * 1 ≤ Arr[i] ≤ 10^6
 * Problem Statement 5:
 */

class Assignment {
    public static int ArrayCheck(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int arr[] = new int[] { 10, 20, 30, 24, 50 };
        System.out.println(ArrayCheck(arr));
    }
}
/*
 * Problem Statement 7:
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing
 * order, and two integers m and n, representing the number of elements in nums1
 * and
 * nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * The final sorted array should not be returned by the function, but instead be
 * stored
 * inside the array nums1. To accommodate this, nums1 has a length of m + n,
 * where
 * the first m elements denote the elements that should be merged, and the last
 * n
 * elements are set to 0 and should be ignored. nums2 has a length of n.
 * 
 * Example 1:
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * 
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming
 * from
 * nums1.
 * Example 2:
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 */

class Assignment {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int k = m + n;
        int temp = k;
        int[] arr1 = new int[] { 1, 2, 3, 0, 0, 0 };
        int[] arr2 = new int[] { 2, 5, 6 };
        int i = 0;
        while (k != 0 && i < arr2.length) {
            k--;
            arr1[k] = arr2[i];
            i++;
        }
        
        for (i = 0; i < temp; i++) {
            for (int j = 1; j < temp; j++) {
                if (arr1[j - 1] > arr1[j]) {
                    int temp2 = arr1[j - 1];
                    arr1[j - 1] = arr1[j];
                    arr1[j] = temp2;
                }
            }
        }
        System.out.print(Arrays.toString(arr1));
    }
}

/*
 * Problem Statement 9:
 * You are given a 0-indexed integer array nums and a target element target.
 * A target index is an index i such that nums[i] == target.
 * Return a list of the target indices of nums after sorting nums in
 * non-decreasing
 * order. If there are no target indices, return an empty list. The returned
 * list must be
 * sorted in increasing order.
 * 
 * Example 1:
 * Input: nums = [1,2,5,2,3], target = 2
 * Output: [1,2]
 * Explanation: After sorting, nums is [1,2,2,3,5].
 * The indices where nums[i] == 2 are 1 and 2.
 * 
 * Example 2:
 * Input: nums = [1,2,5,2,3], target = 3
 * Output: [3]
 * Explanation: After sorting, nums is [1,2,2,3,5].
 * The index where nums[i] == 3 is 3.
 * Example 3:
 * Input: nums = [1,2,5,2,3], target = 5
 * Output: [4]
 * Explanation: After sorting, nums is [1,2,2,3,5].
 * The index where nums[i] == 5 is 4.
 */

// steps used solun 1)merge sort 2) check target in main function

class MergeSort {
    public static void conquere(int[] nums, int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= ei) {
            if (nums[i] < nums[j]) {
                temp[k] = nums[i++];
            } else {
                temp[k] = nums[j++];
            }
            k++;
        }
        while (i <= mid) { // self solved
            temp[k++] = nums[i++];
        }
        while (j <= ei) {
            temp[k++] = nums[j++];
        }
        for (i = si, k = 0; k < temp.length; k++, i++) {
            nums[i] = temp[k];
        }
    }

    public static void mergesort(int[] nums, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergesort(nums, si, mid);
        mergesort(nums, mid + 1, ei);
        conquere(nums, si, mid, ei);
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 5, 2, 3 };
        int target = 5;
        mergesort(nums, 0, nums.length - 1);
        System.out.print("[ ");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.print(i + " ");
            }
        }
        System.out.print("]");
    }
}