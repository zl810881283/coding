import java.util.Arrays;
import java.util.Scanner;

// 2019-01-27-01-package-search-withmem
public class Main {
  static int[] v;
  static int[] w;

  static int[][] mem;

  static int search(int i, int j) {
    if (mem[i][j] > 0) {
      return mem[i][j];
    }
    if (i == 0)
      return mem[i][j] = 0;
    else if (w[i - 1] > j)
      return mem[i][j] = search(i - 1, j);
    else
      return mem[i][j] = Math.max(search(i - 1, j), search(i - 1, j - w[i - 1]) + v[i - 1]);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int maxW = sc.nextInt();
    mem = new int[n + 1][maxW + 1];
    for (int i = 0; i < n + 1; i++) {
      Arrays.fill(mem[i], -1);
    }
    v = new int[n];
    w = new int[n];
    for (int i = 0; i < n; i++) {
      v[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      w[i] = sc.nextInt();
    }
    System.out.println(search(n, maxW));
  }
}