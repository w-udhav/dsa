package stack;

import java.util.ArrayList;
import java.util.Stack;

public class twoD_mah {
  private static ArrayList nsl() {
    Stack<Integer> s = new Stack<>();
    ArrayList<Integer> left = new ArrayList<>();

    return left;
  }

  private static ArrayList nsr() {
    Stack<Integer> s = new Stack<>();
    ArrayList<Integer> right = new ArrayList<>();

    return right;
  }

  private static int mah(ArrayList<Integer> arr) {
    ArrayList<Integer> left = nsl();
    ArrayList<Integer> right = nsr();
    // ArrayList<Integer> area = new ArrayList<>();
    int ans = Integer.MIN_VALUE;

    for(int i=0; i < arr.size(); i++){
      int val = (right.get(i) - left.get(i) - 1) * arr.get(i);
      ans = Math.max(ans, val);
    }

    return ans;
  }

  public static void main(String[] args) {
    int arr[][] = { { 0, 1, 1, 0 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 0, 0 } };

  }
}
