// add package name here if needed
//
class RaiseToExponent {

  public static int raiseToExponent(int base, int exponent) {
    if (exponent == 0) { // base case
      return 1;
    } else {
      return base * raiseToExponent(base, exponent - 1); // recursive call
    }
  }

  public static void main(String[] args) {

    int base = 3;
    int exponent = 4;
    int result = raiseToExponent(base, exponent);
    System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    
  }
}

