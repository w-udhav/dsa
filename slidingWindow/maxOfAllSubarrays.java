package slidingWindow;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class maxOfAllSubarrays {
  private static int[] solution(int[] arr, int size, int k) {
    Queue<Integer> q = new LinkedList<>();
    int[] ans = new int[size - k + 1];
    int idx = 0;
    int i = 0, j = 0;

    while (j < size) {
      // calculation
      while (q.size() > 0 && q.peek() < arr[j])
        q.poll();
      q.add(arr[j]);
      // windows size fulfiled
      if (j - i + 1 == k) {
        // ans <--- calculation
        ans[idx++] = q.peek();
        if (q.peek() == arr[i])
          q.poll();
        // slide the window
        i++;
      }
      j++;
    }

    return ans;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
    int k = 3; // window size
    System.out.println(Arrays.toString(solution(arr, arr.length, k)));
  }
}
