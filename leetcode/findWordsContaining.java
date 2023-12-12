package leetcode;

import java.util.ArrayList;
import java.util.List;

public class findWordsContaining {
  public static void main(String[] args) {
    String[] words = { "nhd", "zheyegi", "ogz", "fpybmcc", "ntbbwtde" };
    char x = 'g';

    System.out.println(solution(words, x));
  }

  private static List<Integer> solution(String[] words, char x) {
    ArrayList<Integer> res = new ArrayList<>();
    int i = 0;
    int j = 0;
    res.get(i);
    while (i < words.length && j < words[i].length()) {
      System.out.println("i: " + i + "  " + "j: " + j);
      if (words[i].charAt(j) == x) {
        res.add(i);
        i++;
        j=0;
      } else {
        j++;
        if (j == words[i].length()) {
          i++;
          j = 0;
        }
      }
    }
    System.out.println("i: " + i + "  " + "j: " + j);
    return res;
  }
}
