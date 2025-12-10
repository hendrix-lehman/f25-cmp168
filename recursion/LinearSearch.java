// add package name here if needed
//
class LinearSearch {

  public static int linearSearch(int[] arr, int target, int index) {

    if (index < 0 || index >= arr.length) {
      return -1; // base case, target not found
    } else if (arr[index] == target) { // base case, target found
      return index; // Target found
    } else {
      return linearSearch(arr, target, index + 1); // recursive call
    }

  }

  public static void main(String[] args) {

    int[] arr = { 82, 87, 75, 99, 91, 95, 72, 54 };
    int target = 54;
    int result = linearSearch(arr, target, 0);
    if (result != -1) {
      System.out.println("Target found at index: " + result);
    } else {
      System.out.println("Target not found in the array.");
    }
    
  }
}

