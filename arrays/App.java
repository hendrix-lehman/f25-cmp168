// add package name here if needed
//
class App {

  public static void main(String[] args) {

    // Array of integers
    // declare array
    int[] numbers;

    // Allocate memory for 5 integers
    numbers = new int[5];

    System.out.println("array numbers length: " + numbers.length);

    // loop through the array
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("array numbers[" + i + "] = " + numbers[i]);
    }

    // assign values to the array
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i * 10;
      System.out.println("array numbers[" + i + "] = " + numbers[i]);
    }

    // outbound array access
    // System.out.println("array numbers[5] = " + numbers[5]);

    // initializing a list of values
    int[] values = { 10, 20, 30, 40, 50 };
    System.out.println("array values length: " + values.length);
    for (int i = 0; i < values.length; i++) {
      System.out.println("array values[" + i + "] = " + values[i]);
    }

    int temp = values[0];
    values[0] = values[4];
    values[4] = temp;
    System.out.println("After swapping:");
    for (int i = 0; i < values.length; i++) {
      System.out.println("array values[" + i + "] = " + values[i]);
    } 
  }
}

