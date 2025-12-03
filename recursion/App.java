// add package name here if needed
//
class App {
  private int number = 3; // instance variable

  public int add(App app, int y) {
    System.out.println("Inside add method. app.getNumber() = " + app.getNumber());
    // x = 100;
    app.setNumber(100); // modifying instance variable via method
    // return x + y;
    return app.getNumber() + y;
  }

  public String getString() {
    return "Hello from App class!";
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public void changeString(String str) {
    str = "Changed inside method";
    System.out.println("Inside changeString method: " + str);
  }

  public void greet(String name) {
    int a = 5;
    System.out.println("Greetings from App class!");
    System.out.println("Hello, " + name + "!");
    // greet("Maria");
    add(this, 10);
    System.out.println("a = " + a);
    System.out.println("Some work here...");
    System.out.println("Work completed.");
  }

  public static void main(String[] args) {
    App app = new App();
    app.greet("Jose"); // calling greet without arguments
    //
    int aX = 3;
    int bY = 4;
    int sum = app.add(app, bY); // calling add method
    System.out.println("aX: " + aX);

    String message = "Main method is running.";

    message = "Updated message in main method.";

    System.out.println("app.getNumber() = " + app.getNumber()); // accessing instance variable via method

    app.changeString(message);
    System.out.println("In main method: " + message); // original message remains unchanged
    //
    String str = app.getString();
    System.out.println(str);

    System.out.println("I cannot read the value of x and y here."); // they are local to add method
    System.out.println("Main method execution completed.");

  }
}

