// add package name here if needed
//
import java.util.Scanner;

class App {

  public static void main(String[] args) {

    // decision branching
    // if ... else if ... else
    //

    Scanner scanner = new Scanner(System.in);
    System.out.print("Is it sunny? (1: true/0: false): ");
    boolean isSunny = scanner.nextBoolean();
    // String input = scanner.nextLine();
    // int input = scanner.nextInt();
    if (isSunny) {
      System.out.println("It's a sunny day! Let's go to the beach.");
    } else {
      System.out.println("It's not sunny. Maybe we can go to a museum.");
    }

    // switch ... case ... default

    System.out.print("Enter a number (1-3): ");
    int number = scanner.nextInt();
    switch (number) {
      case 1:
        System.out.println("You entered one.");
        break;
      case 2:
        System.out.println("You entered two.");
        break;
      case 3:
        System.out.println("You entered three.");
        break;
      default:
        System.out.println("Number not in range 1-3.");
        break;
    }
    

  }
}

