// add package name here if needed
//
class BinarySearch {


  public static int binarySearch(int[] arr, int target, int startIndex, int endIndex) {
    if (startIndex > endIndex) {
      return -1; // base case. Target not found
    }
    int mid = startIndex + (endIndex - startIndex) / 2;
    if (arr[mid] == target) {
      return mid; // base case. Target found
    } else if (arr[mid] > target) {
      return binarySearch(arr, target, startIndex, mid - 1); // recursive call in the left half
    } else {
      return binarySearch(arr, target, mid + 1, endIndex); // recursive call in the right half 
    }
  }
  

  public static void main(String[] args) {

    int[] arr = {54, 59, 67, 72, 75, 82, 87, 91, 95, 99};
    int target = 87;
    int result = binarySearch(arr, target, 0, arr.length - 1);
    if (result != -1) {
      System.out.println("Element found at index: " + result);
    } else {
      System.out.println("Element not found in the array.");
    }
    
  }
}

