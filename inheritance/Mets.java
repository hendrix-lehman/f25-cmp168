// add package name here if needed
//
class Mets extends Team {

  // constructor
  Mets(String coach) {
    super("Mets", "New York", coach);
  }

  class MetsPlayer extends Player {
    MetsPlayer(String name, String position, int number) {
      super(name, position, number);
    }
  }

  @Override
  void printRecord() {
    System.out.println("Yay!!! Here is our Record: " + this.wins + " - " + this.losses);
  }

  void printRecord(String message) {
    System.out.println(message + " Here is our Record: " + this.wins + " - " + this.losses);
  }

  @Override
  public String toString() {
    return "Mets Team [name=" + name + ", city=" + city + ", coach=" + coach + ", score=" + score + ", standing="
        + standing + ", wins=" + wins + ", losses=" + losses + "]"
        + super.listPlayers();
  }

  @Override
  public void playBall() {
    System.out.println("Mets are playing ball!");
  }
}

