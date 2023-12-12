package leetcode;

public class checkIfTwoStrArrays {

  private static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    StringBuilder s1 = new StringBuilder();
    StringBuilder s2 = new StringBuilder();
    for (String x : word1) {
      s1.append(x);
    }
    for (String x : word2) {
      s2.append(x);
    }
    System.out.println(s1 + " " + s2);

    if (s1.toString().equals(s2.toString())) return true;
    else return false;
  }

  public static void main(String[] args) {
    String[] word1 = { "ab", "c" };
    String[] word2 = { "a", "bc" };
    System.out.println(arrayStringsAreEqual(word1, word2));
  }
}
