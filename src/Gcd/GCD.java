package Gcd;

public class GCD {

  private long gcd( long a, long b) {
    System.out.println(a + " " + b);
    while (true) {
      if (a == 0) return b;
      if (b == 0) return a;
      if (a >= b) {
        a %= b;
      } else {
        b %= a;
      }
    }
  }

  private void run() {
    System.out.println(gcd(124567536754611311L, 1353245634523467543L));
    System.out.println(gcd(1245675367546131L, 13532436345267543L));
//    System.out.println(gcd(0, 1));
//    System.out.println(gcd(1, 0));
  }

  public static void main(String[] args) {
    long startTime = System.currentTimeMillis();
    new GCD().run();
    long finishTime = System.currentTimeMillis();

    System.out.println(finishTime - startTime + "ms");
  }
}
