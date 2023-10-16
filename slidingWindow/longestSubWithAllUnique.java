package slidingWindow;

import java.util.HashMap;

public class longestSubWithAllUnique {
  private static int solution(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    int mx = Integer.MIN_VALUE;
    int i = 0, j = 0;
    while (j < s.length()) {
      char ch = s.charAt(j);
      if (map.containsKey(ch)) {
        map.put(ch, map.get(ch) + 1);
      } else {
        map.put(ch, 1);
      }

      if (map.size() == j - i + 1) {
        mx = Math.max(mx, j - i + 1);
      }

      if (map.size() < j - i + 1) {
        while (map.size() < j - i + 1) {
          char c = s.charAt(i);
          map.put(c, map.get(c) - 1);
          if (map.get(c) == 0) {
            map.remove(c);
          }
          i++;
        }
      }

      j++;
    }
    return mx;
  }

  public static void main(String[] args) {
    String s = "pwwkew";
    System.out.println(solution(s));
  }
}
