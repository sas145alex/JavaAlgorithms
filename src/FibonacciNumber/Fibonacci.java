package FibonacciNumber;


public class Fibonacci {

  private static final int MOD = (int) (1e9 + 7);

  private int fibonacci(int n) {
    int a = 0;
    int b = 1;
    for (int i = 0; i < n; i++) {
      int c = (a + b) % MOD;
      a = b;
      b = c;
    }
    return a;
  }

  private void run(int n) {
    System.out.println("n = " + n + " : " + fibonacci(n));
  }

  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    new Fibonacci().run(100000);
    long finishTime = System.currentTimeMillis();

    System.out.println(finishTime - startTime + "ms");
  }
}
