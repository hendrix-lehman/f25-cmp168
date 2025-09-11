// add package name here if needed
//
class App {

  public static void main(String[] args) {
    Car car1 = new Car(); // using default constructor to create an object of Car
    Car car2 = new Car("red", "Toyota", 2021, "hybrid"); // using parameterized constructor

    // calling methods on car1
    car1.startEngine();
    car1.stopEngine();

    // let's call the mutator method to change the color of car1
    // car1.setColor("blue");

    // capturing return value from a method
    String car1Info = car1.toString();
    System.out.println(car1Info);

    String car2Info = car2.toString();
    System.out.println(car2Info);
    
    // calling getters/accessors to check if engine is started
    System.out.println("Is car1 engine started? " + car1.isEngineStarted());

    // using equals method to compare two car objects
    System.out.println("Are car1 and car2 the same? " + car1.equals(car2));
  }
}

