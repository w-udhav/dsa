package algorithms;

class binarySearch {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    int target = 5;
    System.out.println(search(arr, target));
  }

  public static int search(int[] arr, int target) {

    int s = 0;
    int e = arr.length - 1;
    int mid = 0;

    mid = s + (e - s) / 2;

    while (s <= e) {
      if (arr[mid] == target)
        return mid;
      if (arr[mid] > target)
        e = mid - 1;
      if (arr[mid] < target)
        s = mid + 1;

      mid = s + (e - s) / 2;
    }
    return -1;
  }
}