// add package name here if needed
//
class Factorial {

  public static int factorial(int n) {
    if (n < 0) { /// handle negative input
      throw new IllegalArgumentException("Negative numbers do not have a factorial.");
    }
    if (n == 0 || n == 1) { // base case, math rules
      return 1;
    }
    return n * factorial(n - 1); // recursive call 
  }

  public static int factorialIterative(int n) {
    if (n < 0) { // handle negative input
      throw new IllegalArgumentException("Negative numbers do not have a factorial.");
    }
    int result = 1;
    for (int i = 2; i <= n; i++) {
      result *= i;
    }
    return result;
  }

  public static void main(String[] args) {

    int number = 4; // example input
    int result = factorial(number);
    System.out.println("Factorial of " + number + " is: " + result);

    int iterativeResult = factorialIterative(number);
    System.out.println("Iterative Factorial of " + number + " is: " + iterativeResult);
    
  }
}

