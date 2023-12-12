import java.util.Scanner;

public class divide {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dividend = sc.nextInt();
    int divisor = sc.nextInt();
    int count=0;

    while(dividend > 0){
      dividend -= divisor;
      count--;
    }
    System.out.println(-count);

    sc.close();
  }
}
