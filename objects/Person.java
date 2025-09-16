// add package name here if needed
//
class Person {

  // member variables
  private String name;
  private double weight;
  private double height;
  private int age;
  private Car[] cars;
  private int numCars; // index to track number of cars owned

  // constructor
  // default constructor
  public Person() {
    this.name = "Doe";
    this.cars = new Car[5]; // can own up to 5 cars
  }

  // parameterized constructor
  public Person(String name, double weight, double height, int age) {
    this.name = name;
    this.weight = weight;
    this.height = height;
    this.age = age;
    this.cars = new Car[5]; // can own up to 5 cars
  }

  // getters
  public String getName() {
    return name;
  }

  public double getWeight() {
    return weight;
  }

  public double getHeight() {
    return height;
  }

  public int getAge() {
    return age;
  }

  public Car[] getCars() {
    return cars;
  }

  public String getCarsAsString() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < numCars; i++) {
      sb.append(cars[i].toString()).append("\n");
    }
    return sb.toString();
  }

  public Car getCarAtIndex(int index) {
    if (index >= 0 && index < numCars) {
      return cars[index];
    }
    return null; // or throw an exception
  }

  public void speak() {
    System.out.println("Hello, my name is " + name + ".");
  }

  public void tellCarToStart(int carIndex) {
    if (carIndex >= 0 && carIndex < numCars) {
      cars[carIndex].startEngine();
    } else {
      System.out.println("I don't own a car at index " + carIndex);
    }
  }

  public void tellAllCarsToStart() {
    for (int i = 0; i < numCars; i++) {
      cars[i].startEngine();
    }
  }

  // setters
  public void setName(String name) {
    this.name = name;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void adoptCar(Car car) {
    if (numCars < cars.length) {
      cars[numCars] = car;
      numCars++;
    } else {
      System.out.println("Cannot add more cars. Maximum limit reached.");
    }
  }

}

