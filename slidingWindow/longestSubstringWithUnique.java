package slidingWindow;

import java.util.HashMap;

public class longestSubstringWithUnique {
  private static int solution(String s, int k) {
    HashMap<Character, Integer> map = new HashMap<>();
    int mx = Integer.MIN_VALUE;
    int mxi = 0, mxj = 0;

    int i = 0, j = 0;
    while (j < s.length()) {
      char ch = s.charAt(j);
      if (map.containsKey(ch)) {
        map.put(ch, map.get(ch) + 1);
      } else {
        map.put(ch, 1);
      }

      if (map.size() == k) {
        mx = Math.max(mx, j - i + 1);
        mxi = i;
        mxj = j;
      }
      if (map.size() > k) {
        while (map.size() > k) {
          char c = s.charAt(i);
          map.put(c, map.get(c) - 1);
          if (map.get(c) == 0)
            map.remove(c);
          i++;
        }
      }

      j++;
    }
    System.out.println("Substring:" + s.substring(mxi, mxj));
    return mx;
  }

  public static void main(String[] args) {
    String s = "aabacbebebe";
    int k = 3;
    System.out.println("Count: " + solution(s, k));
  }
}
