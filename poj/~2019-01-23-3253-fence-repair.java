import java.util.Arrays;
import java.util.Scanner;

//2019-01-23-3253-fence-repair
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] arr = new long[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextLong();
    }
    Arrays.sort(arr);
    long res = -arr[0];
    long sum = 0;
    for (int i = 0; i < n; i++) {
      sum += arr[i];
      res += sum;
    }
    System.out.println(res);
  }
}