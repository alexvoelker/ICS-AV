/*
 * SFHS ~ 19-20
 * Intro CS ~ Mrs. Vollucci
 * Lab 5.2: More Practice with Iteration & Recursion
 */

class IterateRecurse {
  public static void main(String[] args) {

    //Problem 1 Tests
    morn_aft_eve("Alex", 3);
    morn_aft_eve("Peter", 1);

    // Problem 2 Tests
    System.out.println(sum_div3_for(1,7));
    System.out.println(sum_div3_for(1,10));

    // Problem 3 Tests
    System.out.println(sum_div3_for(1,10));
    System.out.println(sum_div3_for(1,15));

    // Problem 4 Tests
    System.out.println(count_x("Hi Hello Hey HannaH", 'H'));
    System.out.println(count_x("Awesome Android Dog Apple", 'A'));

    //Problem 5 Tests
    System.out.println(pattern_AB("xz", "zz", 2));
    System.out.println(pattern_AB("ui", "ay", 3));

    // Problem 6 Tests
    System.out.println(mult_pos(-5, 6));
    System.out.println(mult_pos(-5, -6));
    System.out.println(mult_pos(0, 10));
    System.out.println(mult_pos(13, 2));
    System.out.println(mult_pos(12, 0));
  }

  public static void morn_aft_eve (String x, int y) { //Problem 1
    if (y == 1){
      System.out.println("Good Morning, " + x);
    }
    else if (y == 2) {
      System.out.println("Good Afternoon, " + x);
    }
    else {
      System.out.println("Good Evening, " + x);
    }
  }

  public static int sum_div3_for (int a, int b) { //Problem 2
    int sum = 0;
    for(int i = a; i <= b; i++){
      if (i%3 == 0){
        sum = sum + i;
      }
    }
    return sum;
  }

  public static int sum_odd_while (int c, int d) { //Problem 3
    int sum = 0;
    int i = c;
    while (i <= d) {
      if (i%2 == 1) {
        sum = sum + i;
        i++;
      }
    }
    return sum;
  }

  public static int count_x(String z, Character x) { //Problem 4
    int sum = 0;
    int i = 0;
    while(i < z.length()){
      if (z.charAt(i) == x){
       sum++;
      }
      i++;
    }
    return sum;
  }

  public static String pattern_AB (String w, String x, int y) { //Problem 5
    String sum = "";
    for (int i = 0; i < y; i++) {
      sum = sum + w + x;
    }
    return sum;
  }

  public static int mult_pos(int x, int y) { //Problem 6
    int sum = 0;
    int repeat = 0;
    if (y > 0) {
      repeat = y;
    }
    else if (y < 0) {
      repeat = y - y - y;
    }
    else if ( (x == 0) || (y == 0)) {
      repeat = 0;
    }
    for (int i = 0; i < repeat; i++) {
      if ( (x > 0) && (y > 0) ) {
        sum = sum + x;
      }
      else if ( (x < 0) && (y > 0) ) {
        sum = sum + x;
      }
      else if ( (x < 0) && (y < 0) ) {
          sum = sum + (x - x - x);
      }
      else if ( (x > 0) && (y < 0) ) {
          sum = sum - x;
      }
      }
    return sum;
  }
}
