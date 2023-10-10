package slidingWindow;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class firstNegative {
  private static int[] solution(int[] arr, int n, int k) {
    int[] ans = new int[n - k + 1];
    int index = 0;
    Queue<Integer> q = new LinkedList<>();
    int i = 0, j = 0;
    while (j < n) {
      if (arr[j] < 0)
        q.add(arr[j]);

      if (j - i + 1 == k) {
        if (q.size() == 0)
          ans[index++] = 0;
        else {
          ans[index++] = q.peek();
          if (arr[i] == q.peek())
            q.poll();
        }
        i++;
      }
      j++;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr = { 12, -1, -7, 8, -15, 30, 16, 28 };
    int k = 3;
    System.out.println(Arrays.toString(solution(arr, arr.length, k)));
  }
}
