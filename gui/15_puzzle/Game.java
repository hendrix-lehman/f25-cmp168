import javax.swing.JFrame;

class Game extends JFrame {

  public Game() {
    this.setTitle("15-Puzzle Game");
    this.setSize(400, 400);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.add(new Board());
    this.setVisible(true);
  }


}

