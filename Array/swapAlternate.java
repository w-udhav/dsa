package Array;

import java.util.Arrays;

public class swapAlternate {
  public static void main(String[] args) {
    int[] arr = { 1, 5, 6, 7, 9, 2, 0, 6 };
    int size = arr.length;

    for (int i = 0; i < size; i += 2) {
      if (i + 1 < size) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
      }
    }
    System.out.println(Arrays.toString(arr));
  }

  static void printArr(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

}