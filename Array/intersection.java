package Array;

import java.util.*;

public class intersection {
  public static void main(String[] args) {
    Vector<Integer> ans = new Vector<Integer>();
    int[] arr1 = { 1, 4, 5 };
    int[] arr2 = { 3, 4, 5 };

    int i = 0, j = 0;
    int n = arr1.length;
    int m = arr2.length;

    while (i < n && j < m) {
      if (arr1[i] < arr2[j]) {
        i++;
      } else if (arr1[i] == arr2[j]) {
        ans.add(arr1[i]);
        i++;
        j++;
      } else {
        j++;
      }
    }

    System.out.println(ans.toString());
  }
}