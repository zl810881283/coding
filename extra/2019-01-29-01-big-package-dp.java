import java.util.Arrays;
import java.util.Scanner;

// 2019-01-29-01-big-package-dp
public class Main {
  static int[] v;
  static int[] w;

  static int[][] dp;

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int maxW = sc.nextInt();
    v = new int[n];
    w = new int[n];
    for (int i = 0; i < n; i++) {
      v[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      w[i] = sc.nextInt();
    }
    System.out.println(getMaxValue(maxW, v, w));
  }

  public static long getMaxValue(int maxW, int[] v, int[] w) {

    int maxV = 0;
    for (int i = 0; i < v.length; i++) {
      maxV += v[i];
    }
    int[][] dp = new int[v.length + 1][maxV + 1];

    for (int i = 0; i < dp.length; i++) {
      Arrays.fill(dp[i], (int) 2e9);
    }
    for (int i = 0; i <= v.length; i++) {
      dp[i][0] = 0;
    }
    for (int j = 1; j <= maxV; j++) {
      for (int i = 1; i <= v.length; i++) {
        int remain = j - v[i - 1];
        if (remain < 0)
          remain = 0;
        dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][remain] + w[i - 1]);
      }
    }
    for (int j = maxV; j >= 0; j--) {
      if (dp[v.length][j] <= maxW)
        return j;
    }
    return 0;
  }
}