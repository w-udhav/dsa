package slidingWindow;

public class maxSumSubarray {

  static int solution(int[] arr, int size, int k){
    int mx = Integer.MIN_VALUE;
    int sum=0, i=0, j=0;
    while(j<size){
      sum+=arr[j];
      if(j-i+1 < k) j++;
      else if(j-i+1 == k){
        mx = Math.max(mx, sum);
        sum -= arr[i];
        i++;
        j++;
      }
    }
    return mx;
  }
  public static void main(String[] args) {
    int[] arr = {2,5,1,8,2,9,1};
    int k = 3;
    System.out.println("Ans: " + solution(arr, arr.length, k));
  }
}
