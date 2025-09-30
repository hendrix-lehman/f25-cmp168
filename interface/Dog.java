// add package name here if needed
//
class Dog extends Pet implements Communicator, Comparable<Dog> {
  
  // attributes
  private static int numDogs = 0;
  private int dogNumber;
  private String name;
  private double weight; // in pounds
  private double height; // in inches
  private boolean isVaccinated;
  private int ageInDogYears;

  // default constructor
  public Dog() {
    super(); // call the default constructor of the superclass (Pet)
    numDogs++;
    this.dogNumber = numDogs;
    this.name = "doggy Doe";
    this.weight = 0.0;
    this.height = 0.0;
    this.isVaccinated = false;
    this.ageInDogYears = 0;
  }

  // parameterized constructor
  public Dog(String name){
    this();
    this.name = name;
  }

  public Dog(String name, double weight, double height) {
    this(name);
    this.weight = weight;
    this.height = height;
  }

  public Dog(String name, boolean isVaccinated, int age) {
    this(name);
    this.isVaccinated = isVaccinated;
    this.ageInDogYears = age;
  }

  public Dog(String name, double weight, double height, boolean isVaccinated, int age) {
    super(); 
    numDogs++;
    this.dogNumber = numDogs;
    this.name = name;
    this.weight = weight;
    this.height = height;
    this.isVaccinated = isVaccinated;
    this.ageInDogYears = age;
  }

  // getters
  public int getDogNumber() {
    return dogNumber;
  }

  public String getName() {
    return name;
  }

  public double getWeight() {
    return weight;
  }

  public double getHeight() {
    return height;
  }

  public boolean getIsVaccinated() {
    return isVaccinated;
  }

  public int getAgeInDogYears() {
    return ageInDogYears;
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

  public void setIsVaccinated(boolean isVaccinated) {
    this.isVaccinated = isVaccinated;
  }

  public void setAgeInDogYears(int ageInDogYears) {
    this.ageInDogYears = ageInDogYears;
  }

  // implement the abstract method play() from the superclass Pet
  @Override
  public void play() {
    System.out.println("WOOF! Let's play fetch with " + getFavoriteToy());
  }

  @Override
  public String toString() {
    return "Dog #" + super.toString() + dogNumber + ": " + name + ", Weight: " + weight + " lbs, Height: " + height + " inches, Vaccinated: " + isVaccinated + ", Age in Dog Years: " + ageInDogYears;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if(this == obj) {
      return true;
    }
    if(obj instanceof Dog){
      // cast obj to Dog
      Dog otherDog = (Dog) obj;
      // now we can use the variable otherDog to compare attributes
      // if(ageInDogYears == otherDog.ageInDogYears) {
      //   if(Math.abs(height - otherDog.height) < 0.5) {
      //     if(Math.abs(weight - otherDog.weight) < 0.5) {
      //       if(isVaccinated == otherDog.isVaccinated) {
      //         if((name != null) && (otherDog.name != null)) {
      //           if(name.equals(otherDog.name)) {
      //             return true;
      //           }
      //         }
      //       }
      //     }
      //   }
      // }
      // return false;
      return super.equals(otherDog) && 
             (ageInDogYears == otherDog.ageInDogYears) &&
             (Math.abs(height - otherDog.height) < 0.5) &&
             (Math.abs(weight - otherDog.weight) < 0.5) &&
             (isVaccinated == otherDog.isVaccinated) &&
             ((name != null) && (otherDog.name != null) && name.equals(otherDog.name));
    }
    return false;
  }

  // implement the methods from the FoodEater interface
  @Override
  public void eat() {
    System.out.println("WOOF! I am a Dog that eats!");
  }

  @Override
  public void eat(Food food) {
    System.out.println("WOOF! I will eat " + food.getName() + " now.");
  }

  @Override
  public double metabolizeFood(Food food) {
    return food.getCalories() * METABOLISM_RATING_MEDIUM;
  }
  
  // implement the method from the Communicator interface
  @Override
  public void speak() {
    System.out.println("Woof! Woof!");
  }

  @Override
  public void speak(String message) {
    System.out.println("Woof! " + message + " Woof!");
  }

  // implement the method from the Comparable interface
  @Override
  public int compareTo(Dog otherDog) {
    if(this.dogNumber > otherDog.dogNumber) {
      return 1;
    } else if(this.dogNumber < otherDog.dogNumber) {
      return -1;
    }
    return 0;
  }

}

