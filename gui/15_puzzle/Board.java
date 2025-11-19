import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// This class represents the 15-puzzle game board. 
// It extends JPanel to allow for graphical representation and interaction.
//
class Board extends JPanel {

  public Board() {
    GridLayout layout = new GridLayout(4, 4);
    this.setLayout(layout);

    init();
    shuffle();
  }

  private void init() {
    for (int i = 0; i <= 15; i++) {
      JButton tile = new JButton(String.valueOf(i));
      tile.setFont(new Font("Arial", Font.BOLD, 24));
      if (i == 0) {
        tile.setText("");
        tile.setContentAreaFilled(false);
      }
      tile.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
          if (tile.getText().equals("")) {
            return;
          }
          System.out.println("Tile " + tile.getText() + " double-clicked");
          swapWithEmptyTile(tile);
          if (isSolved()) {
            System.out.println("Puzzle solved!");
          }
      }});
      this.add(tile);
    }
  }

  private void shuffle() {
    // loop through all components
    for (int i = 0; i < this.getComponentCount(); i++) {
      JButton tile1 = (JButton) this.getComponent(i);
      int randomIndex = (int) (Math.random() * this.getComponentCount());
      JButton tile2 = (JButton) this.getComponent(randomIndex);
      swapTiles(tile1, tile2);
    }
  }

  private void swapTiles(JButton tile1, JButton tile2) {
    String tempText = tile1.getText();
    tile1.setText(tile2.getText());
    tile2.setText(tempText);

    // Update content area filled property for empty tile
    tile1.setContentAreaFilled(tile1.getText().equals("") ? false : true);
    tile2.setContentAreaFilled(tile2.getText().equals("") ? false : true);
  }

  private void swapWithEmptyTile(JButton tile) {
    int index = getCurrentTileComponentIndex(tile);
    int totalTiles = this.getComponentCount();

    int topIndex = index - 4;
    int bottomIndex = index + 4;
    int leftIndex = index - 1;
    int rightIndex = index + 1;

    if (topIndex >= 0) {
      JButton topTile = (JButton) this.getComponent(topIndex);
      System.out.println("Top tile: " + topTile.getText());
      if(topTile.getText().equals("")) {
        swapTiles(tile, topTile);
        System.out.println("Top tile is empty");
      }
    }
    if (bottomIndex < totalTiles) {
      JButton bottomTile = (JButton) this.getComponent(bottomIndex);
      System.out.println("Bottom tile: " + bottomTile.getText());
      if(bottomTile.getText().equals("")) {
        swapTiles(tile, bottomTile);
        System.out.println("Bottom tile is empty");
      }
    }
    if (leftIndex >= 0 && index % 4 != 0) {
      JButton leftTile = (JButton) this.getComponent(leftIndex);
      System.out.println("Left tile: " + leftTile.getText());
      if(leftTile.getText().equals("")) {
        swapTiles(tile, leftTile);
        System.out.println("Left tile is empty");
      }
    }
    if (rightIndex < totalTiles && (index + 1) % 4 != 0) {
      JButton rightTile = (JButton) this.getComponent(rightIndex);
      System.out.println("Right tile: " + rightTile.getText());
      if(rightTile.getText().equals("")) {
        swapTiles(tile, rightTile);
        System.out.println("Right tile is empty");
      }
    }
  }

  private int getCurrentTileComponentIndex(JButton tile) {
    for (int i = 0; i < this.getComponentCount(); i++) {
      JButton currentTile = (JButton) this.getComponent(i);
      if (currentTile.equals(tile)) {
        System.out.println("Current tile index: " + i);
        return i;
      }
    }
    return -1;
  }

  private boolean isSolved() {
    for (int i = 0; i < this.getComponentCount(); i++) {
      JButton tile = (JButton) this.getComponent(i);
      String expectedText = (i == 0) ? "" : String.valueOf(i);
      if (!tile.getText().equals(expectedText)) {
        return false;
      }
    }
    return true;
  }

}

