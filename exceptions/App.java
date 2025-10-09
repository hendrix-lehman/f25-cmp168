// add package name here if needed
//
import java.util.Scanner;

class App {

  public static void main(String[] args) {
    MathGenius mg = new MathGenius();

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number to divide 10 by: ");

    int userInput = scanner.nextInt();
    int result;
    boolean validInput = true;

    // validate input using a loop

//     do {
//       if (userInput == 0) {
//         System.out.println("The number 0 is invalid. Please use any other number.");
//         System.out.println("Enter a number to divide 10 by: ");
//         userInput = scanner.nextInt();
//       } else {
//         validInput = false;
//       }
//     } while (validInput);

    int number = 0;
    System.out.println("The default value of number is: " + number); // This will cause a compile-time error

    try {
      result = mg.divide(10, userInput);
      System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
      System.out.println("The number 0 is invalid. Please use any other number.");
      System.out.println(e.getMessage());
    } catch (UnsupportedOperationException e) {
      System.out.println("Unsupported Operation.");
      System.out.println(e.getMessage());
    } catch (NoDivisionByOneException e) {
      System.out.println("Division by one is not allowed. Please use any other number.");
      System.out.println(e.getMessage());
    } finally {
      System.out.println("Thank you for using the division program.");
      scanner.close();
    }


    // int counter = 0;
    // for (int i = 10; i > counter; i--) {
    //   System.out.println("Counter: " + counter);
    //   int x = mg.divide(5, (i - 8)); // This will cause a division by zero when i is 8
    //   System.out.println("x: " + x);

    //   counter++;
    // }

    // mg.printHello();
    
  }
}

