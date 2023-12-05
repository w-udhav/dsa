package recursion;

import java.util.Stack;

public class deleteMiddleOfStack {
  static void solve(Stack<Integer> s, int k) {
    if (s.size() == 0)
      return;
    if (k == 1) {
      s.pop();
      return;
    }
    int temp = s.pop();
    solve(s, k - 1);
    s.push(temp);
  }

  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    int k = s.size() / 2 + 1;
    solve(s, k);
    System.out.println(s);
  }
}
