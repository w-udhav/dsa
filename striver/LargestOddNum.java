package striver;

public class LargestOddNum {
  public static void main(String[] args) {
    String num = "52";
    System.out.println(largestNum(num));

  }

  public static String largestNum(String num) {
    for (int i = num.length() - 1; i >= 0; i--) {
      int n = num.charAt(i);
      System.out.println(n);
      if (n % 2 != 0) {
        return num.substring(0, i + 1);
      }
    }
    return "";
  }
}
