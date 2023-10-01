package stack;

import java.util.Stack;

class minStack {
  Stack<Long> st = new Stack<>();
  Stack<Long> s = new Stack<>();
  long minEle;

  minStack() {
    minEle = Integer.MAX_VALUE;
  }

  void push(int x) {
    if (s.isEmpty())
      s.push((long)x);
    else {
      if (x >= minEle)
        s.push((long)x);
      else {
        st.push(2 * x - minEle);
        minEle = x;
      }
    }
  }

  void pop() {
    if (s.isEmpty())
      return;
    else {
      if (s.peek() >= minEle)
        s.pop();
      else {
        minEle = 2 * minEle - s.peek();
        s.pop();
      }
    }
  }

  int peek() {
    if (s.isEmpty())
      return -1;
    else {
      if (s.peek() >= minEle)
        return s.peek();
      else
        return minEle;
    }
  }
}

public class minStack2 {

  public static void main(String[] args) {
    minStack st = new minStack();
    
  }
}
