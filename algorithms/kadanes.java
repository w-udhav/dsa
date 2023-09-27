package algorithms;

public class kadanes {
  public static void main(String[] args) {
    int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
    int ans = func(arr);

    System.out.println(ans);
  }

  public static int func(int[] arr) {
    int max = Integer.MIN_VALUE;
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      if (sum > max)
        max = sum;
      if (sum < 0)
        sum = 0;
    }

    return max;
  }
}
