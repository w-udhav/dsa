package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class nearestToRight {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 2, 4 };
    ArrayList<Integer> ans = new ArrayList<Integer>();
    Stack<Integer> s = new Stack<>();

    int n = arr.length;

    for (int i = n - 1; i >= 0; i--) {
      if (s.size() == 0)
        ans.add(-1);

      else if (s.size() > 0 && s.peek() > arr[i]) {
        ans.add(s.peek());
      }

      else if (s.size() > 0 && s.peek() <= arr[i]) {
        while (s.size() > 0 && s.peek() <= arr[i]) {
          s.pop();
        }

        if (s.size() == 0)
          ans.add(-1);

        else
          ans.add(s.peek());
      }
      s.push(arr[i]);
    }
    Collections.reverse(ans);
    System.out.println(ans);
  }
}
