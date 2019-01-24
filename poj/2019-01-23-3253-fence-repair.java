import java.util.Arrays;
import java.util.Scanner;
//2019-01-23-3253-fence-repair
public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    int res = -arr[0];
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += arr[i];
      res += sum;
    }
    System.out.println(res);
  }
}