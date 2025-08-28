// add package name here if needed
//
class Variable {

  public static void main(String[] args) {

    // we can declare a variable like this
    // Here we declare and initialize a variable of type String
    // we initialize it with the value "Hello, World!"
    String greeting = "Hello, World!";
    greeting = greeting + "some other text";

    // we can use the variable like this. 
    // the function println is used to print text to the console
    System.out.println(greeting);


    // we can also declare a variable without initializing it
    int number;
    // and then initialize it later
    number = 42;
    System.out.println(number);

    number = 100;
    System.out.println(number);

    int a = 5;
    int b = 3;
    // adding two variables. 
    // Java uses the value of the variables when doing operations
    int sum = a + b;
    System.out.println(sum);

    sum = a * 4; // the number 4 is a literal value. Hardcoded in the code
    System.out.println(sum);


    // the computer ONLY understands binary values (0 and 1)

    // Binary review:
    // A single binary digit is called a bit
    // 8 bits = 1 byte => 00000000 (8 bits)
    //
    // that means that a byte data type can store 256 different values
    // 00000000
    // 00000001
    // 00000010
    // 00000011
    // ...
    // 11111111
    //
    byte luckyDay = Byte.MAX_VALUE; // a byte variable can store values from -128 to 127
    System.out.println(luckyDay + 5); // + operator is adds a byte to an int, result is an int 


    number = Integer.MAX_VALUE; // 2,147,483,647
    System.out.println(number + 5); // overflow, wraps around to -2,147,483,648

    // primitives: byte, short, int, long, float, double, char, boolean
    // they are initialized with default values if not explicitly initialized


    boolean isJavaFun = true; // true or false

    // constants
    final double PI = 3.14159; // constant variable, cannot be changed
    System.out.println(PI);

    double newNumber = (double) number; // casting int to double
    System.out.println(newNumber);

    System.out.println(greeting.charAt(0)); // accessing a character in a String

    
  }
}

