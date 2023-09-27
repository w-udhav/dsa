package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class maxAreaHistogram {

  public static ArrayList<Integer> nsl(int[] arr, int n) {
    Stack<Integer> s = new Stack<>();
    ArrayList<Integer> left = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      if (s.isEmpty()) {
        left.add(-1);
      } else if (!s.isEmpty() && arr[s.peek()] < arr[i]) {
        left.add(s.peek());
      } else {
        while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
          s.pop();
        }

        if (s.isEmpty()) {
          left.add(-1);
        } else {
          left.add(s.peek());
        }
      }

      s.push(i);
    }

    return left;
  }

  public static ArrayList<Integer> nsr(int[] arr, int n) {
    Stack<Integer> s = new Stack<>();
    ArrayList<Integer> right = new ArrayList<>();

    for (int i = n - 1; i >= 0; i--) {
      if (s.isEmpty()) {
        right.add(n);
      } else if (!s.isEmpty() && arr[s.peek()] < arr[i]) {
        right.add(s.peek());
      } else {
        while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
          s.pop();
        }
        if (s.isEmpty()) {
          right.add(n);
        } else {
          right.add(s.peek());
        }
      }
      s.push(i);
    }

    Collections.reverse(right);

    return right;
  }

  public static void main(String[] args) {
    int[] arr = { 6, 2, 5, 4, 5, 1, 6 };
    ArrayList<Integer> right = new ArrayList<Integer>(nsr(arr, arr.length));
    ArrayList<Integer> left = new ArrayList<Integer>(nsl(arr, arr.length));
    ArrayList<Integer> area = new ArrayList<>();
    int ans = Integer.MIN_VALUE;

    // Finding the width
    for (int i = 0; i < arr.length; i++) {
      int val = (right.get(i) - left.get(i) - 1) * arr[i];
      area.add(val);
      ans = Math.max(val, ans);
    }

    System.out.println(ans);
  }
}
