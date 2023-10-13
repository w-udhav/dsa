package slidingWindow;

public class longestSubarraySum {
  private static int solution(int[] arr, int size, int k) {
    int mx = Integer.MIN_VALUE;
    int i = 0, j = 0;
    int sum = 0;

    while (j < size) {
      sum = sum + arr[j];
      if (sum == k) {
        mx = Math.max(mx, j - i + 1);
      } else if (sum > k) {
        while (sum > k) {
          sum = sum - arr[i];
          i++;
        }
      }
      j++;
    }
    return mx;
  }

  public static void main(String[] args) {
    int[] arr = { 4, 1, 1, 1, 2, 3, 5 };
    int k = 5;
    System.out.println(solution(arr, arr.length, k));
  }
}
