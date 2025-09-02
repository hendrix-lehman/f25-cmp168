// add package name here if needed
//
class App {

  public static void main(String[] args) {
    
    // loops
    //
    // for loop

    for ( /* declare a local variable*/int i = 0; /* condition*/ i<= 5; /* increment*/ i++ ) {
      System.out.println("i = " + i);
    }

    for(;;) {
      // infinite loop
      break; // to avoid infinite loop
    }

    // loop an array
    int[] numbers = {1, 2, 3, 4, 5};
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("numbers[" + i + "] = " + numbers[i]);
    }

    //
    // while loop
    //
    int j = 0;
    while (j < 5) {
      System.out.println("j = " + j);
      j++;
    }
    
    //
    // do while loop
    //
    int k = 0;
    do {
      System.out.println("k = " + k);
      k++;
    } while (k < 5);

    //
    // for each loop
    //
    for (int number : numbers) {
      System.out.println("number = " + number);
    }

  }
}

