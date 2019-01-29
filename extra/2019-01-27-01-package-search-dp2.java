import java.util.Arrays;
import java.util.Scanner;

// 2019-01-27-01-package-search-dp2
public class Main {
  static int[] v;
  static int[] w;

  static int[][] dp;

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int maxW = sc.nextInt();
    dp = new int[n+1][maxW+1];
    v = new int[n];
    w = new int[n];
    for (int i = 0; i < n; i++) {
      v[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      w[i] = sc.nextInt();
    }

    // 不断由 d[i][j] 更新下一行的元素
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= maxW; j++) {
        dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j]);
        if (w[i] + j <= maxW)
          dp[i + 1][w[i] + j] = Math.max(dp[i + 1][w[i] + j], dp[i][j] + v[i]);
      }
    }
    System.out.println(dp[n][maxW]);
  }
}