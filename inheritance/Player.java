// add package name here if needed
//
class Player {
  // attributes
  String name;
  String position;
  int number;
  int battingAverage;
  int homeRuns;

  // constructor
  Player(String name, String position, int number) {
    this.name = name;
    this.position = position;
    this.number = number;
    this.battingAverage = 0;
    this.homeRuns = 0;
  }

  // getter methods
  String getName() {
    return this.name;
  }

  String getPosition() {
    return this.position;
  }

  int getNumber() {
    return this.number;
  }

  int getBattingAverage() {
    return this.battingAverage;
  }

  int getHomeRuns() {
    return this.homeRuns;
  }

  // setter methods
  void setPosition(String position) {
    this.position = position;
  }

  void setNumber(int number) {
    this.number = number;
  }

  void updateBattingAverage(int average) {
    this.battingAverage = average;
  }

  void hitHomeRun() {
    this.homeRuns += 1;
  }
}

