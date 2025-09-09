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

    System.out.println("Integer MAX_VALUE: " + Integer.MAX_VALUE);
    System.out.println("Integer MIN_VALUE: " + Integer.MIN_VALUE);
    int max = getMaxOfArray(newValues);
    System.out.println("Max value in newValues array: " + max); 
    int min = getMinOfArray(newValues);
    System.out.println("Min value in newValues array: " + min);

    int sum = sumOfArray(newValues);
    System.out.println("Sum of values in newValues array: " + sum);

    double mean = meanOfArray(newValues);
    System.out.println("Mean of values in newValues array: " + mean);

    int searchFor = 144;
    // int index = linearSearch(newValues, searchFor);
    int[] sortedForSearch = insertionSort(newValues);
    printArray(sortedForSearch);
    int index = binarySearch(sortedForSearch, searchFor);
    if (index != -1) {
      System.out.println("Found " + searchFor + " at index " + index);
    } else {
      System.out.println(searchFor + " not found in the array");
    }

    // System.out.println("Before sorting:");
    // printArray(newValues);
    // int[] sorted = bubbleSort(newValues);
    // int[] sorted = selectionSort(newValues);
    // int[] sorted = insertionSort(newValues);
    // System.out.println("After sorting:");
    // printArray(sorted);

  }

  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println("array[" + i + "] = " + array[i]);
    }
  }

  public static int linearSearch(int[] array, int value) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == value) {
        return i;
      }
    }
    return -1; // not found
  }

  public static int binarySearch(int[] array, int value) {
    int left = 0;
    int right = array.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (array[mid] == value) {
        return mid;
      }
      if (array[mid] < value) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1; // not found
  }

  public static int[] insertionSort(int[] array) {
    int n = array.length;
    for (int i = 1; i < n; i++) {
      int key = array[i];
      int j = i - 1;

      // Move elements of array[0..i-1], that are greater than key,
      // to one position ahead of their current position
      while (j >= 0 && array[j] > key) {
        array[j + 1] = array[j];
        j = j - 1;
      }
      array[j + 1] = key;
    }
    return array;
  }

  public static int[] selectionSort(int[] array) {
    int n = array.length;
    for (int i = 0; i < n - 1; i++) {
      // Find the minimum element in unsorted array
      int minIdx = i;
      for (int j = i + 1; j < n; j++) {
        if (array[j] < array[minIdx]) {
          minIdx = j;
        }
      }
      // Swap the found minimum element with the first element
      int temp = array[minIdx];
      array[minIdx] = array[i];
      array[i] = temp;
    }
    return array;
  }

  public static int[] bubbleSort(int[] array) {
    int n = array.length;
    boolean swapped;
    for (int i = 0; i < n - 1; i++) {
      swapped = false;
      for (int j = 0; j < n - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          // swap array[j] and array[j+1]
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          swapped = true;
        }
      }
      // If no two elements were swapped by inner loop, then break
      if (!swapped) {
        break;
      }
    }
    return array;
  }

  public static double meanOfArray(int[] array) {
    int sum = sumOfArray(array); 
    return (double) sum / array.length;
  }

  public static int sumOfArray(int[] array) {
    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    return sum;
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

