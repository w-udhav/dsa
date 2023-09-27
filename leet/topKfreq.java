package leet;
// https://leetcode.com/problems/top-k-frequent-elements/

import java.util.*;

public class topKfreq {
  public static void main(String[] args) {
    int nums[] = { 1, 1, 1, 2, 2, 3 };
    int k = 2;
    ArrayList<Integer> ans = new ArrayList<>();

    if (k == nums.length)
      return;

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    ArrayList<Integer> ele = new ArrayList<>();
    ArrayList<Integer> counts = new ArrayList<>();

    int n = nums.length;
    int i = 0;
    int j = 1;
    int count = 1;
    while (i < n && j < n) {
      if (nums[i] == nums[j]) {
        count++;
      } else {
        ele.add(nums[i]);
        counts.add(count);
        count = 1;
      }
      i++;
      j++;
    }
    ele.add(nums[i]);
    counts.add(count);

    while (k > 0) {
      int index = 0;
      for (int m = 0; m < counts.size(); m++) {
        if (counts.get(m) > max) {
          max = counts.get(m);
          index = m;
        }
      }
      System.out.println("counts : " + counts);
      System.out.println("index : " + index);
      counts.set(index, -1);
      ans.add(ele.get(index));
      k--;
    }

    // System.out.println(ele);
    // System.out.println(counts);

    System.out.println(ans);
  }
}
