// add package name here if needed
//
class Recursive {

  // non-recursive method to add two integers
  public int add(int a, int b) {
    return a + b;
  }

  // recursive method to add two integers
  public int addRecursive(int a, int b) {
    if (b == 0) { // 2. Base case. A termination point
      return a;
    } else {
      return addRecursive(a + 1, b - 1); // 1. Recursive method call. A call to itself
    }
  }

  // interative method to add two integers
  public int addIterative(int a, int b) {
    while (b != 0) {
      a++;
      b--;
    }
    return a;
  }

  public static void main(String[] args) {

    Recursive app = new Recursive();
    int result = app.add(5, 7);
    System.out.println("The result is: " + result);

    // recursive addition
    int recursiveResult = app.addRecursive(5, 7);
    System.out.println("The recursive result is: " + recursiveResult);
    
    // iterative addition
    int iterativeResult = app.addIterative(5, 99999997);
    System.out.println("The iterative result is: " + iterativeResult);
  }
}

