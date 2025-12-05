// add package name here if needed
//

class SumTwoNumbers {

  // recursive method to add two integers
  public static int addRecursive(int a, int b) {
    if (a == 0) { // 2. Base case. A termination point
      return b;
    } else {
      return addRecursive(a - 1, b + 1); // 1. Recursive method call. A call to itself
    }
  }

  // interative method to add two integers
  public static int addIterative(int a, int b) {
    while (a != 0) {
      a--;
      b++;
    }
    return b;
  }

  public static void main(String[] args) {

    int recursiveResult = addRecursive(5, 7);
    System.out.println("The recursive result is: " + recursiveResult);
    
    int iterativeResult = addIterative(5, 7);
    System.out.println("The iterative result is: " + iterativeResult);
    
  }
}

