// add package name here if needed
//
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.ComponentOrientation;
import javax.swing.JButton;

class BoxLayoutPanel extends JPanel {

  public BoxLayoutPanel(int choice) {
    BoxLayout layout = new BoxLayout(this, choice);

    JButton button1 = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");
    JButton button3 = new JButton("Button 3");
    JButton button4 = new JButton("Button 4");
    JButton button5 = new JButton("Button 5");

    add(button1);
    add(button2);
    add(button3);
    add(button4);
    add(button5);

    applyComponentOrientation(getComponentOrientation());
    setLayout(layout);
  }
}

