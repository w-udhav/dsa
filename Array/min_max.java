package Array;

import java.util.Scanner;

public class min_max{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n=sc.nextInt();
    int[] arr = new int[n];
    int maxNo=Integer.MIN_VALUE;
    int minNo=Integer.MAX_VALUE;

    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
      maxNo=Math.max(maxNo, arr[i]);
      minNo=Math.min(minNo, arr[i]);
    }

    System.out.println("MIN: "+minNo);
    System.out.println("MAX: "+maxNo);



    sc.close();
  }
 
}