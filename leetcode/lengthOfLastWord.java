package leetcode;

public class lengthOfLastWord {
  public static void main(String[] args) {
    String s = "Hello World";
    System.out.println(func(s));
  }

  public static int func(String s) {
    int size = s.length();
    int count = 0;
    boolean lastSpace = false;

    for (int i = size - 1; i >= 0; i--) {
      if (s.charAt(i) == ' ' && count == 0) {
        lastSpace = true;
        continue;
      }

      if (s.charAt(i) != ' ') {
        count++;
      } else {
        return count;
      }
    }

    return count;
  }
}
