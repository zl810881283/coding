import java.util.Scanner;
// 2019-01-29-longest-common-subsequence
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    System.out.println(longestCommonSubsequence(a, b));
  }

  /**
   * @param A: A string
   * @param B: A string
   * @return: The length of longest common subsequence of A and B
   */
  public static int longestCommonSubsequence(String a, String b) {
    // write your code here
    int[][] dp = new int[a.length() + 1][b.length() + 1];
    for (int i = 0; i <= a.length(); i++) {
      dp[i][0] = 0;
    }
    for (int i = 0; i <= b.length(); i++) {
      dp[0][i] = 0;
    }
    for (int i = 1; i <= a.length(); i++) {
      for (int j = 1; j <= b.length(); j++) {

        if (a.charAt(i - 1) == b.charAt(j - 1)) {
          dp[i][j] = dp[i - 1][j - 1] + 1;
        } else {
          dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
        }

      }
    }
    return dp[a.length()][b.length()];
  }
}