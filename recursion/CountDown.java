// add package name here if needed
//
class CountDown {

  // recursive countdown method
  public void startTailRecursive(int countFrom) {
    if (countFrom < 1) { // base case
      System.out.println("Happy New Year!");
    } else {
      System.out.println(countFrom);
      startTailRecursive(countFrom - 1); // recursive call, tail recursion
      // no more statements after the recursive call
    }
    // no more statements here
  }

  public void startHeadRecursive(int countFrom) {
    if (countFrom < 1) { // base case
      System.out.println("Happy New Year!");
    } else {
      startHeadRecursive(countFrom - 1); // recursive call
      System.out.println(countFrom); // notice this is after the call
    }
  }

  // iterative countdown method
  public void startIterative(int countFrom) {
    System.out.println("Counting down to celebrate!");
    for (int i = countFrom; i >= 1; i--) {
      System.out.println(i);
    }
    System.out.println("Happy New Year!");
  }

  public static void main(String[] args) {

    if (args.length != 1) {
      System.out.println("Usage: java CountDown <number>");
      return;
    }

    int countFrom = Integer.parseInt(args[0]);

    CountDown cd = new CountDown();
    // cd.startIterative(countFrom);
    //
    cd.startTailRecursive(countFrom);
    System.out.println("-----");
    cd.startHeadRecursive(countFrom);
   
    // a lot more stuff done here
  }
}

