// add package name here if needed
//
public interface FoodEater {

  static final double METABOLISM_RATING_FAST = .75;
  static final double METABOLISM_RATING_MEDIUM = .50;
  static final double METABOLISM_RATING_SLOW = .25;

  void eat();

  void eat(Food food);

  double metabolizeFood(Food food);
}

