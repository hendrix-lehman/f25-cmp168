// add package name here if needed
//
class MathGenius {

  public void printHello() {
    System.out.println("Hello from MathGenius!");
    printHello();
  }

  public int divide(int a, int b) throws NoDivisionByOneException {
    if (b == 1) {
      throw new NoDivisionByOneException();
    }
    return a / b;
  } 
}

