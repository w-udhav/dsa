package leetcode;

import java.util.Arrays;

public class rainWaterTrapping{
  public static void main(String[] args) {
    // Given list
    int arr[] = {3,0,0,2,0,4};
    int size = arr.length;

    // Extra space
    int water[] = new int[size];
    int mxl[] = new int[size];
    int mxr[] = new int[size];

    mxl[0] = arr[0];
    for(int i=1; i<size; i++){
      mxl[i] = Math.max(mxl[i-1], arr[i]);
    }

    mxr[size-1] = arr[size-1];
    for(int i=size-2; i>=0; i--){
      mxr[i] = Math.max(mxr[i+1], arr[i]);
    }

    int sum= 0;
    for(int i=0; i<size; i++){
      water[i] = Math.min(mxl[i], mxr[i]) - arr[i];
      sum+=water[i];
    }

    System.out.println("mxl   : " + Arrays.toString(mxl));
    System.out.println("mxr   : " + Arrays.toString(mxr));
    System.out.println("water : " + Arrays.toString(water));
    System.out.println("sum   = "+sum);
  }
}