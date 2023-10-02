package leetcode;

import java.util.Stack;

public class reversePolishNotation {
  public static void main(String[] args) {
    String[] tokens = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };

    Stack<String> s = new Stack<>();
    for (int i = 0; i < tokens.length; i++) {
      if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("/") || tokens[i].equals("*")) {
        String op = tokens[i];
        int b = Integer.parseInt(s.pop());
        int a = Integer.parseInt(s.pop());
        int total = 0;
        switch (op) {
          case "+":
            total = a + b;
            break;
          case "-":
            total = a - b;
            break;
          case "*":
            total = a * b;
            break;
          case "/":
            total = a / b;
            break;
        }
        s.push(String.valueOf(total));

      } else {
        s.push(tokens[i]);
      }
    }

    System.out.println(s.pop());
  }
}
