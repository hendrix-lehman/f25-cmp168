import java.util.Random;

class Importantclasses {

  public static void main(String[] args) {

    // the Math class
    System.out.println("Math class:");
    System.out.println("Max of 5 and 10: " + Math.max(5, 10));
    System.out.println("Square root of 16: " + Math.sqrt(16));
    System.out.println("Random number: " + Math.random());
    System.out.println("Abs of -10: " + Math.abs(-10));
    System.out.println("Power of 2^3: " + Math.pow(2, 3));
    System.out.println();

    // the Random class
    System.out.println("Random class:");
    Random rand = new Random();
    System.out.println("Random integer: " + rand.nextInt(100));
    System.out.println("Random double: " + rand.nextDouble());
    System.out.println("Random boolean: " + rand.nextBoolean());
    System.out.println();

    
  }
}

