package slidingWindow;

import java.util.HashMap;

public class countOccurrencesAnagram {
  private static int solution(String s, String ptr, int k) {
    int ans = 0;
    int i = 0, j = 0;
    HashMap<Character, Integer> map = new HashMap<>();
    for (char ch : ptr.toCharArray()) {
      if (map.containsKey(ch))
        map.put(ch, map.get(ch) + 1);
      else
        map.put(ch, 1);
    }
    int count = map.size();

    while (j < s.length()) {
      // 1. calculations
      char c = s.charAt(j);
      if (map.containsKey(c)) {
        map.put(c, map.get(c) - 1);
        if (map.get(c) == 0) {
          count--;
        }
      }
      // System.out.println(map + " " + count);
      if (j - i + 1 == k) {
        // 2. ans <- calculations
        if (count == 0)
          ans++;

        // 3. slide the window
        char ch = s.charAt(i);
        if (map.containsKey(ch)) {
          map.put(ch, map.get(ch) + 1);
          if (map.get(ch) == 1) {
            count++;
          }
        }
        i++;
      }
      j++;
    }
    return ans;
  }

  public static void main(String[] args) {
    String s = "forxxorfxdofr";
    String ptr = "for";
    int k = ptr.length();
    System.out.println("Count: " + solution(s, ptr, k));
  }
}
