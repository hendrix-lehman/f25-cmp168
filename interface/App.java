// add package name here if needed
//
class App {

  public static void main(String[] args) {

    // abstract class cannot be instantiated
    // so, the code below will cause a compile-time error
    // AbstractClass obj = new AbstractClass();
    //
    // interface cannot be instantiated
    // so, the code below will cause a compile-time error
    // Interface obj2 = new Interface();
    //
    System.out.println("Interface constant value: " + Interface.CONSTANT_VALUE);

    // calling default method from interface
    Interface.staticMethod();

    SomeClassThatImplementInterface obj3 = new SomeClassThatImplementInterface();

    obj3.someMethod();

    
  }
}

