public class sample {
  public static void main(String[] args) {
    // Sum of element of array
    int n = 3;
    int[] arr = { 4, 5, 6 };

    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = 0; j < n; j++) {
        if (i != j)
          sum += arr[j];
      }
      System.out.print(sum + " ");
    }
  }
}
