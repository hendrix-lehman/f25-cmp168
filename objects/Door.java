// add package name here if needed
//
class Door {

  // member variables
  String color;
  String material;

  public Door(String color, String material) {
    this.color = color;
    this.material = material;
  }

  // getters
  public String getColor() {
    return color;
  }

  public String getMaterial() {
    return material;
  }

  // setters
  public void setColor(String color) {
    this.color = color;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  @Override
  public String toString() {
    return "Door [color=" + color + ", material=" + material + "]";
  }
}

