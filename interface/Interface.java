// add package name here if needed
//
interface Interface {

  // constants (public static final variables)
  public static final int CONSTANT_VALUE = 42;

  // public void someMethod() {
    // this method has a body, which is not allowed in interfaces
  // }

  abstract void someMethod(); // this is allowed

  // default void defaultMethod() {
  default void defaultMethod() {
    // implementation here
    System.out.println("This is a default method in an interface.");
  }

  // static void staticMethod() {
  static void staticMethod() {
    // implementation here
    System.out.println("This is a static method in an interface.");
  }
}

