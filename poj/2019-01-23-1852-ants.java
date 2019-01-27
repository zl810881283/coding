import java.util.Scanner;

// 2019-01-23-1852-ants
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    while (n-- > 0) {
      int len = scanner.nextInt();
      int num = scanner.nextInt();
      int[] ants = new int[num];
      int max = 0, min = 0;
      for (int i = 0; i < num; i++) {
        ants[i] = scanner.nextInt();
        max = Math.max(max, Math.max(ants[i], len - ants[i]));
        min = Math.max(min, Math.min(ants[i], len - ants[i]));
      }
      System.out.println(min + " " + max);
    }
  }
}