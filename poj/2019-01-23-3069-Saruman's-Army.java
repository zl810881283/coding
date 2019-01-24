import java.util.Arrays;
import java.util.Scanner;

// 2019-01-23-3069-Saruman's-Army
public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      int r = scanner.nextInt();
      int n = scanner.nextInt();
      if (r == n && n == -1) {
        return;
      }
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = scanner.nextInt();
      }
      Arrays.sort(arr);
      int res = 0;
      for (int i = 0; i < n; i++) {
        int s = i;
        for (int j = 1; i + j < n; j++) {
          if (arr[i + j] - arr[i] <= r)
            s = i + j;
          else
            break;

        }
        i = s;
        for (int j = 1; j + s < n; j++) {
          if (arr[s + j] - arr[s] <= r)
            i = s + j;
          else
            break;
        }
        res++;
      }

      System.out.println(res);
    }

  }
}