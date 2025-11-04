// add package name here if needed
//
class App {


  public static void displayTwoDimensionalArray(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + "\t");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
   
    // number types
    int myNum = 5;               // Integer (whole number)
    long myLongNum = 15000000000L; // Long integer (with 'L' suffix)
    double myFloatNum = 5.99;   // Floating point number
    float myFloatNum2 = 5.99f; // Floating point number (with 'f' suffix)

    // boolean type
    boolean myBool = true;      // Boolean (true or false)

    // text types
    char myLetter = 'D';        // Character
    String myText = "Hello";    // String (text), internally the String class uses an array of characters
                                // ['H', 'e', 'l', 'l', 'o']

    System.out.println("The second letter of myText is: " + myText.charAt(1));

    for (char c : myText.toCharArray()) {
      System.out.println(c);
    }

    int[][] bingo = new int[5][5]; // 2D array (array of arrays) where the first [] is the row and the second [] is the column
    // bingo card row 1
    bingo[0][0] = 2;
    bingo[0][1] = 19;
    bingo[0][2] = 36;
    bingo[0][3] = 51;
    bingo[0][4] = 66;

    System.out.println("Bingo card first row, third column: " + bingo[0][2]);

    // bingo card row 2
    bingo[1][0] = 3;
    bingo[1][1] = 27;
    bingo[1][2] = 35;
    bingo[1][3] = 52;
    bingo[1][4] = 64;

    // bingo card row 3
    bingo[2][0] = 9;
    bingo[2][1] = 26;
    bingo[2][2] = 0; // free space
    bingo[2][3] = 59;
    bingo[2][4] = 63;

    // bingo card row 4
    bingo[3][0] = 8;
    bingo[3][1] = 28;
    bingo[3][2] = 45;
    bingo[3][3] = 46;
    bingo[3][4] = 75;

    // bingo card row 5
    bingo[4][0] = 12;
    bingo[4][1] = 29;
    bingo[4][2] = 41;
    bingo[4][3] = 48;
    bingo[4][4] = 73;

    displayTwoDimensionalArray(bingo);


  }
}

