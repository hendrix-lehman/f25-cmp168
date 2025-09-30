// add package name here if needed
//
class Food {

  // attributes
  private String name;
  private int calories;
  private int portionSizeInOunces;

  // constructors
  public Food(String name, int calories, int portionSizeInOunces) {
    this.name = name;
    this.calories = calories;
    this.portionSizeInOunces = portionSizeInOunces;
  }

  // getters
  public String getName() {
    return name;
  }

  public int getCalories() {
    return calories;
  }

  public int getPortionSizeInOunces() {
    return portionSizeInOunces;
  }

  @Override
  public String toString() {
    return "Food{name='" + name + "', calories=" + calories + ", portionSizeInOunces=" + portionSizeInOunces + "}";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Food food = (Food) obj;
    return calories == food.calories &&
           portionSizeInOunces == food.portionSizeInOunces &&
           name.equals(food.name);
  }
}

