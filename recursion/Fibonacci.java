// add package name here if needed
//
class Fibonacci {

  public static int fibonacci(int n) {
    if (n <= 0) { // base case one
      return 0;
    } else if (n == 1) { /// base case two
      return 1;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2); // two recursive calls
    }
  }

  public static void main(String[] args) {

    int n = 7; // Example input
    int result = fibonacci(n);
    System.out.println("Fibonacci of " + n + " is: " + result);
    
  }
}

