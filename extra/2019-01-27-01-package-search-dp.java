import java.util.Arrays;
import java.util.Scanner;

// 2019-01-27-01-package-search-dp
public class Main {
  static int[] v;
  static int[] w;

  static int[][] dp;

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int maxW = sc.nextInt();
    dp = new int[n + 1][maxW + 1];
    for (int i = 0; i < n + 1; i++) {
      Arrays.fill(dp[i], -1);
    }
    v = new int[n + 1];
    w = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      v[i] = sc.nextInt();
    }
    for (int i = 1; i <= n; i++) {
      w[i] = sc.nextInt();
    }

    for (int i = 0; i < n + 1; i++) {
      for (int j = 0; j < maxW + 1; j++) {
        if (i == 0)
          dp[i][j] = 0;
        else {
          if (w[i] > j)
            dp[i][j] = dp[i - 1][j];
          else
            dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]);
        }
      }
    }
    System.out.println(dp[n][maxW]);
  }
}