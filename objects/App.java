// add package name here if needed
//
class App {

  public static void main(String[] args) {

    System.out.println("Number of Car instances created: " + Car.getNumberOfCars()); // should be 0

    Car car1 = new Car(); // using default constructor to create an object of Car
    String car2Color = "red";
    String car2Model = "Toyota";
    int car2Year = 2021;
    String car2EngineType = "hybrid";
    Door car2Door = new Door("black", "metal");
    System.out.println("Car 2 door color before passing to Car constructor: " + car2Door.getColor()); // prints "black"
    Car car2 = new Car(car2Color, car2Model, car2Year, car2EngineType, car2Door); // using parameterized constructor

    System.out.println("Car 2 color: " + car2Color); // prints "red"
    System.out.println("Car 2 year: " + car2Year); // prints 2021
    System.out.println("Car 2 door color after passing to Car constructor: " + car2Door.getColor()); // prints "pink"

    Car car3 = new Car("green", "Honda", 2022, "electric", new Door("white", "plastic"));

    // calling methods on car1
    car1.startEngine();
    car1.stopEngine();

    // let's call the mutator method to change the color of car1
    // car1.setColor("blue");

    // capturing return value from a method
    // String car1Info = car1.toString();
    // System.out.println(car1Info);
    System.out.println(car1); // toString() is called implicitly

    // String car2Info = car2.toString();
    // System.out.println(car2Info);
    System.out.println(car2); // toString() is called implicitly
    
    // calling getters/accessors to check if engine is started
    System.out.println("Is car1 engine started? " + car1.isEngineStarted());

    // using equals method to compare two car objects
    System.out.println("Are car1 and car2 the same? " + car1.equals(car2));


    // creating a Person object
    Person p = new Person();
    p.adoptCar(car1);
    p.adoptCar(car2);
    p.adoptCar(car3);

    System.out.println(p.getCarsAsString());

    System.out.println("Number of Car instances created: " + Car.getNumberOfCars());
  }
}

