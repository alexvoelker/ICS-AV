import java.lang.Math;
class TypesConditions {
  public static void main(String[] args) {
    // Code to test each methods

    System.out.println(andOP(true,true)); //output: true
    System.out.println(andOP(true,false)); //output: false

    System.out.println(orOP(true, false)); //output: true
    System.out.println(orOP(false, false)); //output: false

    System.out.println(evenoddlength("java")); //output: "even"
    System.out.println(evenoddlength("testing")); //output: "odd"

    System.out.println(sumDouble(7, 7)); //output: 28
    System.out.println(sumDouble(3, 9)); //output: 12

    System.out.println(makes100(89,100)); //output: true
    System.out.println(makes100(63,37)); //output: true
    System.out.println(makes100(99,2)); //output: false

    System.out.println(closeTo100(90)); //output: true
    System.out.println(closeTo100(208)); //output: true
    System.out.println(closeTo100(89)); //output: false
    System.out.println(closeTo100(191)); //output: true

    System.out.println(minOf3(6, 9, 8));  //output: 6
    System.out.println(minOf3(-6, -9, -8)); //output: -9
  }

  public static boolean andOP (boolean A, boolean B) { //Problem 1
    if(A == true){
      if(B == true){
        return true;
        }
      }
    return false;
    }

  public static boolean orOP (boolean A, boolean B) { //Problem 2
      if (A == false){
        if (B == false){
          return false;
          }
        }
      if(A == true){
        if(B == true){
          return true;
          }
        }
      return true;
      }

  public static String evenoddlength (String letters) { //Problem 3
    if (letters.length() % 2 == 0){
      return "even";
      }
    else {
      return "odd";
      }
    }

  public static int sumDouble(int a, int b) { // Problem 4
    if (a == b) {
      return (a + b)*2;
      }
    else {
      return (a + b);
      }
  }

  public static boolean makes100(int x, int y){ //Problem 5
    if (x ==100){
      return true;
      }
    if (y==100){
      return true;
      }
    if (x+y == 100){
      return true;
      }
    else return false;
  }

  public static boolean closeTo100 (int n) { //Problem 6
    if ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10)) {
      return true;
      }
    else {
      return false;
      }
  }
  public static int minOf3 (int d, int e, int f) { //Problem 7
    if ((d < e) && (d < f)) {
        return d;
      }
    else if ((e < d) && (e < f)) {
      return e;
      }
    else if ((f < d) && (f < e)) {
      return f;
      }
    else {
    return d;
      }
    }
  }
