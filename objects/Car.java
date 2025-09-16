// add package name here if needed
//
class Car {

  // attributes, fields, properties, member variables
  // has-a relationship
  String color;
  String model;
  int year;
  String engineType;
  int speed;
  boolean isRunning;
  boolean engineStarted;

  Door carDoor; // Car has-a Door
  //
  private static int numberOfCars; // class variable to track number of Car instances

  // constructors
  // default constructor
  Car() {
    // in Java, "this" keyword refers to the current instance of the class
    this.color = "white";
    this.model = "generic";
    this.year = 2020;
    this.engineType = "gasoline";
    this.speed = 0; // default speed
    this.isRunning = false; // default state
    this.engineStarted = false; // default state

    // increment the class variable to track number of Car instances
    numberOfCars++;
  }

  // overloaded, parameterized constructor
  Car(String color, String model, int year, String engineType, Door carDoor) {
    this.color = color;
    this.model = model;
    this.year = year;
    this.engineType = engineType;
    this.carDoor = carDoor;
    this.speed = 0; // default speed
    this.isRunning = false; // default state
    this.engineStarted = false; // default state

    color = "purple"; // this will not change the instance variable
    year = 1999; // this will not change the instance variable
    carDoor.setColor("pink"); // this will change the color of the door object passed in
    //
    // increment the class variable to track number of Car instances
    numberOfCars++;
  }

  // getters, accessors
  public String getColor() {
    return color;
  }

  public Door getCarDoor() {
    return carDoor;
  }

  public String getModel() {
    return model;
  }

  public int getYear() {
    return year;
  }

  public String getEngineType() {
    return engineType;
  }

  public int getSpeed() {
    return speed;
  }

  public boolean isRunning() {
    return isRunning;
  }

  public boolean isEngineStarted() {
    return engineStarted;
  }

  public static int getNumberOfCars() {
    return numberOfCars;
  }

  // setters, mutators
  public void setColor(String color) {
    this.color = color;
  }

  public void setCarDoor(Door carDoor) {
    this.carDoor = carDoor;
  }

  // we will not allow any changes to the model, year, or engine type after creation
  // In other words, after an instance is created, these attributes are immutable
  //

  // we can use methods to define behaviors
  public void startEngine() {
    engineStarted = true;
    System.out.println("The car engine starting.");
  }

  public void stopEngine() {
    engineStarted = false;
    System.out.println("The car engine stopping.");
  }

  public void drive() {
    isRunning = true;
    System.out.println("The car is driving.");
  }

  public void park() {
    isRunning = false;
    System.out.println("The car is parking.");
  }

  public void accelerate() {
    if (!isRunning) {
      System.out.println("The car is not running. Please start the engine first.");
      return;
    }
    speed += 10; // increase speed by 10 units
    System.out.println("The car is accelerating. Speed: " + speed + " km/h");
  }

  @Override
  public String toString() {
    return "Car [color=" + color + ", model=" + model + ", year=" + year + ", engineType=" + engineType
        + ", speed=" + speed + ", isRunning=" + isRunning + ", engineStarted=" + engineStarted + "]";
  }

  @Override
  public boolean equals(Object anObj) {
    if (this == anObj)
      return true;
    if (anObj == null || getClass() != anObj.getClass())
      return false;
    Car other = (Car) anObj;
    return this.year == other.year && this.speed == other.speed && this.isRunning == other.isRunning
        && this.engineStarted == other.engineStarted && this.color.equals(other.color)
        && this.model.equals(other.model) && this.engineType.equals(other.engineType);
  }

}
