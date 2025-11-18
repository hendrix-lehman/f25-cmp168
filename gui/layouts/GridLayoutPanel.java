import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;

class GridLayoutPanel extends JPanel {

  public GridLayoutPanel() {
    GridLayout layout = new GridLayout(2, 3); // 2 rows, 3 columns
    setLayout(layout);

    JButton btn1 = new JButton("Button 1");
    JButton btn2 = new JButton("Button 2");
    JButton btn3 = new JButton("Button 3");
    JButton btn4 = new JButton("Button 4");
    JButton btn5 = new JButton("Button 5");
    JButton btn6 = new JButton("Button 6");
    // JButton btn7 = new JButton("Button 7");

    add(btn1);
    add(btn2);
    add(btn3);
    add(btn4);
    add(btn5);
    add(btn6);
    // add(btn7);

  }
}

