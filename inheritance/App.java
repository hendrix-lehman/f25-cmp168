// add package name here if needed
//
class App {

  public static void printRecord(Team team) {
    if (team instanceof Mets) {
      ((Mets) team).printRecord("From App Class: ");
    } else {
      team.printRecord();
    }
  }

  public static void main(String[] args) {

    Mets mets = new Mets("Carlos Mendoza");

    // create players and add to team
    for (int i = 0; i < 26; i++) {
      Player player = new Player("Player" + i, "Position" + i, i);
      mets.addPlayer(player);
    }

    mets.playBall();

    mets.addScore(5);
    mets.winGame();
    printRecord(mets);
    // mets.printRecord("Hello Fans!!!");

    Yankees yankees = new Yankees("Aaron Boone");
    // create players and add to team
    for (int i = 0; i < 26; i++) {
      Player player = new Player("Player" + i, "Position" + i, i);
      yankees.addPlayer(player);
    }

    yankees.playBall();

    yankees.addScore(3);
    yankees.loseGame();
    // yankees.printRecord();
    printRecord(yankees);
   
    System.out.println(mets);
    System.out.println(yankees);
  }
}

