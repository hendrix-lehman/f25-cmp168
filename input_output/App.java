import java.util.Scanner;

class App {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = scanner.nextInt();
    scanner.close();
    // System.out.println("You entered: " + number);
    System.out.printf("You %d %s: %d \n", number,"entered", 33);
    System.out.println("You "+ number + " entered: " + 33);

    System.out.println("One");
    System.out.println("Two");

    
  }
}

