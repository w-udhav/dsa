package stack;

import java.util.Stack;

public class stockSpanProblem {

  public static int[] getSpanPrice(int[] arr, int n) {
    Stack<Integer> s = new Stack<>();
    int span[] = new int[n];
    // span[0] = 1;
    // s.push(0);

    // for (int i = 1; i < n; i++) {
    //   while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
    //     s.pop();
    //   }

    //   if (s.isEmpty()) {
    //     span[i] = i + 1;
    //   } else {
    //     span[i] = i - s.peek();
    //   }

    //   s.push(i);
    // }

    for(int i=0; i<n; i++){
      if(s.isEmpty()) span[i]=-1;
      else if(!s.isEmpty() && arr[s.peek()] > arr[i]) span[i]=s.peek();
      else{
        while(!s.isEmpty() && arr[s.peek()] <= arr[i]) s.pop();
        if(s.isEmpty()) span[i]=-1;
        else span[i]=s.peek();
      }
      s.push(i);
    }

    for(int i=0; i<n; i++){
      span[i] = i-span[i];
    }

    return span;
  }

  public static void main(String[] args) {
    int[] arr = { 100, 80, 60, 70, 60, 75, 85 };
    int span[] = getSpanPrice(arr, arr.length);
    for(int s: span){
      System.out.print(s + " ");
    }
  }
}
