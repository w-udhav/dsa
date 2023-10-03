package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class dailyTemperature {
  public static int[] tempData(int[] arr) {
    int n = arr.length;
    Stack<Integer> s = new Stack<>();
    int[] ans = new int[n];

    for (int i = n - 1; i >= 0; i--) {
      if (s.isEmpty()) {
        ans[i] = i;
      } else if (!s.isEmpty() && arr[i] < arr[s.peek()]) {
        ans[i] = s.peek();
      } else {
        while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
          s.pop();
        }
        if (s.isEmpty()) {
          ans[i] = i;
        } else {
          ans[i] = s.peek();
        }
      }
      s.push(i);
    }

    for (int i = 0; i < n; i++) {
      ans[i] = ans[i] - i;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
    System.out.println(Arrays.toString(tempData(temperatures)));

    int[] arr1 = { 30, 40, 50, 60 };
    System.out.println(Arrays.toString(tempData(arr1)));

  }
}
