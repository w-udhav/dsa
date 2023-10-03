package leetcode;

import java.util.Arrays;

public class noOfGoodPairs {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 1, 1, 3 };
    int ans = 0;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length - 1; i++) {
      max = Math.max(max, nums[i]);
    }
    int[] arr = new int[max + 1];
    for (int i = 0; i < nums.length; i++) {
      arr[nums[i]]++;
    }
    System.out.println(Arrays.toString(arr));
    for (int x : arr) {
      ans += (x * (x - 1) / 2);
    }
    System.out.println(ans);
  }
}
