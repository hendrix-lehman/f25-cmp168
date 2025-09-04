// add package name here if needed
//
class App {

  // let's create a method that we can use to describe how methods work
  //
  // A method is a block of code that performs a specific task whenever it is invoked or called.
  // [access modifier] [return type] methodName([parameters]) {
  //   // method body
  //   return [value]; // if return type is not void
  //   }

  // value method example 
  public static int add(int a, int b) {
    // allows us to enforce reusability and we can also validate inputs
    a = 1;
    return a + b;
  }

  // void method example
  public static void printSum(int a, int b) {
    int sum = add(a, b); // reusing the add method
    System.out.println("printSum void method sum = " + sum);
  }

  public void updateDemo(Demo a, String newName) {
    a.setName(newName);
    newName = "Changed name";
  }

  public Demo createAnInstanceOfDemo() {
    Demo demo = new Demo(3, "Test3");
    System.out.println("Inside createAnInstanceOfDemo method: " + demo.getName());
    return demo;
  }

  public static void main(String[] args) {

    // invoking or calling the add method
    int x = 5;
    System.out.println("x before add method: " + x);
    // passing primitive data types to methods
    int sum = add(x, 10);
    System.out.println("x after add method: " + x);

    System.out.println("The sum is: " + sum);

    sum = add(20, 30);
    System.out.println("The sum is: " + sum);

    // invoking or calling the printSum method
    printSum(15, 25);
    printSum(100, 200);
    printSum(-5, 5);

    // passing objects to methods
    Demo demo1 = new Demo(1, "Test1");
    System.out.println("Before updateDemo method: " + demo1.getName());
    App app = new App();
    String newName = "Updated Test1 name";
    System.out.println("newName before updateDemo method: " + newName);
    app.updateDemo(demo1, newName);
    System.out.println("After updateDemo method: " + demo1.getName());
    System.out.println("newName after updateDemo method: " + newName);

    // returning objects from methods
    Demo demo2 = app.createAnInstanceOfDemo();
    
  }
}

