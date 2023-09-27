package striver;

import java.util.Arrays;

public class ReverseWordsInString {
  public static void main(String[] args) {
    String s = "  hello world  ";
    String[] arr = s.split(" +");
    StringBuilder ans = new StringBuilder();

    for (int i = arr.length - 1; i >= 0; i--) {
      ans.append(arr[i]);

      ans.append(" ");

    }

    System.out.println(Arrays.toString(arr));
    System.out.println(ans.length());
    ans.append("|");
    System.out.println(ans);
  }
}
