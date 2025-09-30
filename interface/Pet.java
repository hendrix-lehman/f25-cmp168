// add package name here if needed
//

abstract class Pet implements FoodEater {

  // attributes
  private String favoriteFood;
  private String favoriteToy;
  private int maintenanceLevel;
  private boolean goesOutside;

  // default constructor
  public Pet() {
    this.favoriteFood = "Unknown food";
    this.favoriteToy = "Unknown toy";
    this.maintenanceLevel = 0;
    this.goesOutside = false;
  }

  // parameterized constructor
  public Pet(String favoriteFood, String favoriteToy, int maintenanceLevel, boolean goesOutside) {
    this.favoriteFood = favoriteFood;
    this.favoriteToy = favoriteToy;
    this.maintenanceLevel = maintenanceLevel;
    this.goesOutside = goesOutside;
  }

  // interface abstract methods
  // abstract public void eat();
  // abstract public void eat(Food food);
  // abstract public double metabolizeFood(Food food);

  // notice this abstract method does not have a body or curly braces
  public abstract void play();

  // getters. note that getters by convention start with "get"
  public String getFavoriteFood() {
    return favoriteFood;
  }

  public String getFavoriteToy() {
    return favoriteToy;
  }

  public int getMaintenanceLevel() {
    return maintenanceLevel;
  }

  public boolean goesOutside() {
    return goesOutside;
  }

  // setters. note that setters by convention start with "set"
  public void setFavoriteFood(String favoriteFood) {
    this.favoriteFood = favoriteFood;
  }

  public void setFavoriteToy(String favoriteToy) {
    this.favoriteToy = favoriteToy;
  }

  public void setMaintenanceLevel(int maintenanceLevel) {
    this.maintenanceLevel = maintenanceLevel;
  }

  public void setGoesOutside(boolean goesOutside) {
    this.goesOutside = goesOutside;
  }

  // overriding method from Object class
  @Override
  public String toString() {
    return "Pet [favoriteFood=" + favoriteFood + ", favoriteToy=" + favoriteToy + ", maintenanceLevel="
        + maintenanceLevel + ", goesOutside=" + goesOutside + "]";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    Pet other = (Pet) obj;
    return maintenanceLevel == other.maintenanceLevel && goesOutside == other.goesOutside
        && favoriteFood.equals(other.favoriteFood) && favoriteToy.equals(other.favoriteToy);
  }


}

