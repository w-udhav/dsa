package leetcode;

import java.util.Arrays;

public class mergeSortedArr {
  public static void main(String[] args) {
    int[] nums1 = { 1, 2, 3, 0, 0, 0 };
    int m = 3;
    int[] nums2 = { 2, 5, 6 };
    int n = 3;

    int[] ans = new int[m + n];
    int ptr = 0;

    int i = 0;
    int j = 0;
    while (i < m && j < n) {
      if (nums1[i] <= nums2[j]) {
        ans[ptr] = nums1[i];
        ptr++;
        i++;
      }

      else if (nums1[i] > nums2[j]) {
        ans[ptr] = nums2[j];
        ptr++;
        j++;
      }
    }

    for (int k = j; k < n; k++) {
      ans[ptr] = nums2[k];
      ptr++;
    }

    nums1 = ans;

    System.out.println(Arrays.toString(nums1));
  }
}
