// add package name here if needed
//
class Yankees extends Team {
  // constructor
  Yankees(String coach) {
    super("Yankees", "New York", coach);
  }

  @Override
  public String toString() {
    return "Yankees Team [name=" + name + ", city=" + city + ", coach=" + coach + ", score=" + score + ", standing="
        + standing + ", wins=" + wins + ", losses=" + losses + "]"
        + super.listPlayers();
  }
}

