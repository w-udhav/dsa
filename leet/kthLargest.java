package leet;

import java.util.Arrays;
import java.util.PriorityQueue;

public class kthLargest {
  public static void main(String[] args) {
    int[] arr = { 3, 2, 1, 5, 6, 4 };
    int k = 2;
    // int ans = 0;
    // int n = 0;
    // for (int i = 0; i < arr.length - 1; i++) {
    //   n = Math.max(arr[i], arr[i + 1]);
    // }

    // int[] freq = new int[n + 1];

    // for (int i = 0; i < arr.length; i++) {
    //   freq[arr[i]]++;
    // }
    // int count = 0;
    // for (int i = freq.length - 1; i >= 1; i--) {
    //   count += freq[i];
    //   if (count >= k) {
    //     ans = i;
    //     break;
    //   }

    //   System.out.println("count: " + count);
    // }

    // System.out.println(Arrays.toString(freq));

    // System.out.println(ans);
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    for(int i=0; i<k; i++){
      minHeap.add(arr[i]);
    }

    System.out.println(minHeap.peek());
  }
}
