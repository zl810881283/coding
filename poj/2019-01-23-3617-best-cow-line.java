import java.util.Scanner;

// 2019-01-23-3617-best-cow-line
public class Solution {

  static int decide(String input, int i, int j) {
    int ii = i;
    int jj = j;
    while (ii < jj) {
      if (input.charAt(ii) > input.charAt(jj))
        return j;
      else if (input.charAt(ii) < input.charAt(jj))
        return i;
      else {
        ii++;
        jj--;
      }
    }
    return i;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    String input = "";
    for (int i = 0; i < n; i++) {
      input = input + scanner.next();
    }
    int i = 0;
    int j = n - 1;
    String res = "";
    while (i <= j) {
      if (decide(input, i, j) == i) {
        res = res + input.charAt(i);
        i++;
      } else {
        res = res + input.charAt(j);
        j--;
      }
    }
    System.out.print(res);
  }
}