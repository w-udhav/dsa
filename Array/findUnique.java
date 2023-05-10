package Array;

public class findUnique {
  public static void main(String[] args) {
    int[] arr = {1,2,4,7,1,2,7};
    int size = arr.length;
    int ans=0;

    for(int i=0; i<size; i++){
      ans = ans^arr[i];
    }

    System.out.println(ans);
  }
}
