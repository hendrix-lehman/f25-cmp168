// add package name here if needed
//
abstract class Team {
  // attributes
  String name;
  String city;
  String coach;
  int score;
  int standing;
  int wins;
  int losses;

  Player[] players;
  int numberOfPlayers = 0;

  // constructor
  Team(String name, String city, String coach) {
    this.name = name;
    this.city = city;
    this.coach = coach;
    players = new Player[26];
  }

  // getter methods
  String getName() {
    return this.name;
  }

  String getCity() {
    return this.city;
  }

  String getCoach() {
    return this.coach;
  }

  int getScore() {
    return this.score;
  }

  int getStanding() {
    return this.standing;
  }

  int getWins() {
    return this.wins;
  }

  int getLosses() {
    return this.losses;
  }

  Player[] getPlayers() {
    return this.players;
  }

  // setter methods
  void setCoach(String coach) {
    this.coach = coach;
  }

  void addScore(int points) {
    this.score += points;
  }

  void addPlayer(Player player) {
    if (numberOfPlayers < players.length) {
      players[numberOfPlayers] = player;
      numberOfPlayers++;
    } else {
      System.out.println("Team is full");
    }
  }

  String listPlayers() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < numberOfPlayers; i++) {
      sb.append(players[i].getName()).append(", ");
    }
    return sb.toString();
  }

  void removePlayer(int index) {
    if (index >= 0 && index < numberOfPlayers) {
      for (int i = index; i < numberOfPlayers - 1; i++) {
        players[i] = players[i + 1];
      }
      players[numberOfPlayers - 1] = null;
      numberOfPlayers--;
    } else {
      System.out.println("Invalid index");
    }
  }

  // behaviors
  void winGame() {
    this.wins += 1;
    this.standing += 1;
  }

  void loseGame() {
    this.losses += 1;
    this.standing -= 1;
  }

  void resetScore() {
    this.score = 0;
  }

  void printRecord() {
    System.out.println(this.name + " Record: " + this.wins + " - " + this.losses);
  }

  public abstract void playBall();

}

