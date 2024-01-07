package binarySearch;

class FirtOccurrence {
  private static int solution(int[] arr, int x) {
    if (arr.length == 1)
      return 0;
    int res = -1;
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = start + ((end - start) / 2);
      if (x == arr[mid]) {
        res = mid;
        end = mid - 1;
      } else if (x < arr[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return res;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 10, 10, 10, 18, 20 };
    int x = 10;
    System.out.println(solution(arr, x));
  }
}