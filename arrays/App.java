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

//  swap first and last values
    int temp = values[0];
    values[0] = values[4];
    values[4] = temp;
    System.out.println("After swapping:");
    for (int i = 0; i < values.length; i++) {
      System.out.println("array values[" + i + "] = " + values[i]);
    } 

    // how to copy an array
    int[] copy = new int[values.length];
    for (int i = 0; i < values.length; i++) {
      copy[i] = values[i];
    }

    // resize an array
    int[] resized = new int[values.length * 2];
    for (int i = 0; i < values.length; i++) {
      resized[i] = values[i];
    }
    values = resized;
    System.out.println("After resizing:");
    for (int i = 0; i < values.length; i++) {
      System.out.println("array values[" + i + "] = " + values[i]);
    }
    
    // double the size of an array using a method
    int[] newValues = { -121, 26, 3, 144, 50 };
    // int[] returnedFromMethod = doubleSizeOfArray(newValues);
    newValues = doubleSizeOfArray(newValues);
    System.out.println("1.After attempting to double size in method:");
    System.out.println("1.array newValues length: " + newValues.length);
    System.out.println("1.array newValues contents:");
    printArray(newValues);

    System.out.println("Integer MIN_VALUE: " + Integer.MIN_VALUE);
    int max = getMaxOfArray(newValues);
    System.out.println("Max value in newValues array: " + max); 
    int min = getMinOfArray(newValues);
    System.out.println("Min value in newValues array: " + min);

  }

  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println("array[" + i + "] = " + array[i]);
    }
  }

  public static int getMaxOfArray(int[] array) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }
    return max;
  }

  public static int getMinOfArray(int[] array) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
      }
    }
    return min;
  }

  public static int[] doubleSizeOfArray(int[] array) {
    // println("Inside method, original length: " + array.length);
    printArray(array);

    // double the size of the array and copy the values
    int[] newArray = new int[array.length * 2];
    for (int i = 0; i < array.length; i++) {
      newArray[i] = array[i];
    }
    array = newArray;
    System.out.println("Inside method, new length: " + array.length);
    printArray(array);
    return array;
    
  }


}

