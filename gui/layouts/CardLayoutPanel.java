// add package name here if needed
//
import javax.swing.JPanel;
import java.awt.CardLayout;

class CardLayoutPanel extends JPanel {
  private CardLayout layout;

  public CardLayoutPanel() {
    layout = new CardLayout();
    setLayout(layout);
  }

  public CardLayout getLayout() {
    return layout;
  }

}

