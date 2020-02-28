/*
 * ICS ~ Mini-Lab 5.2:
 * Iteration & Recursion Practice
 * SFHS 2019-2020
 * Mrs. Vollucci
 */

class IterRecur {
  public static void main(String[] args) {

    //System.out.println(fact(5));
    //System.out.println(fact(6));
    //prod2ToNumFOR(6);
    //prod2ToNumFOR(12);
    prod2ToNumWHILE(6);
    prod2ToNumWHILE(12);
  }

  public static int fact(int n) { //problem 1
    if (n == 0)
      return 1;
    else {
      return (n * fact(n-1) );
    }
  }

  public static void prod2ToNumFOR (int x) { //problem 2
    for (int i = 2; i < x; i++) {
      System.out.println(i * x);
    }
  }

  public static void prod2ToNumWHILE (int y) {
    int i = 2;
    while (i < y) {
      System.out.println(i * y);
      i += 1;
    }
  }

}
