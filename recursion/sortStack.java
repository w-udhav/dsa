package recursion;

import java.util.Stack;

public class sortStack {
  static void sort(Stack<Integer> s) {
    if (s.size() == 1)
      return;
    int temp = s.pop();
    sort(s);
    insert(s, temp);
  }

  static void insert(Stack<Integer> s, int temp) {
    if (s.size() == 0 || s.peek() <= temp) {
      s.push(temp);
      return;
    }
    int val = s.pop();
    insert(s, temp);
    s.push(val);
  }

  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(5);
    s.push(1);
    s.push(0);
    s.push(2);
    sort(s);
    System.err.println(s);
  }
}
