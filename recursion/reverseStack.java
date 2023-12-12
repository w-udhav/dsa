package recursion;

import java.util.Stack;

public class reverseStack {
  static void reverse(Stack<Integer> s) {
    if (s.isEmpty())
      return;
    int temp = s.pop();
    reverse(s);
    s.push(temp);
  }

  public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.add(1);
    s.add(2);
    s.add(3);
    s.add(4);
    s.add(5);
    System.out.println(s);
    reverse(s);
    System.out.println(s);
  }
}
