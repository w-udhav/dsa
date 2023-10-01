package leetcode;

import java.util.Arrays;

public class reverseWords3 {
  public static void main(String[] args) {
    String s = "God Ding";
    // System.out.println(Arrays.toString(arr));
    StringBuilder str = new StringBuilder();

    int j = 0;
    int i = 0;
    for (i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ' ') {
        for (int k = i - 1; k >= j; k--) {
          str.append(s.charAt(k));
        }
        j = i + 1;
        str.append(" ");
      }
    }
    for (int k = i - 1; k >= j; k--) {
      str.append(s.charAt(k));
    }
    System.out.println(str.toString());
    System.out.println();
  }
}
