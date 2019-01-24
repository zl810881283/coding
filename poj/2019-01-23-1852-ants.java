import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    while (n-- > 0) {
      int len = scanner.nextInt();
      int num = scanner.nextInt();
      int[] ants = new int[num];
      int max = 0, min = (int)1e9;
      for (int i = 0; i < num; i++) {
        ants[i] = scanner.nextInt();
        max = Math.max(max, Math.max(ants[i], len - ants[i]));
        min = Math.min(min, Math.min(ants[i], len - ants[i]));
      }
      System.out.println(max + " " + min);
    }
  }
}