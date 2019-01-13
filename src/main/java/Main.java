import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int n = 1;
    String str;
    System.out.println("Enter Fibonacci range: ");
    Scanner scanner = new Scanner(System.in);
    str = scanner.nextLine();
    n = Integer.parseInt(str);

    for (int i = 0; i < n ; i++) {
      System.out.println(i + ": " + fibonacci(i));
    }

  }

  public static long fibonacci(int n) {
    if (n <= 1) return n;
    else return fibonacci(n-1) + fibonacci(n-2);
  }




}
