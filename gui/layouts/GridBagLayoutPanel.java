import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;

class GridBagLayoutPanel extends JPanel {

  public GridBagLayoutPanel() {
    GridBagLayout layout = new GridBagLayout();
    setLayout(layout);

    GridBagConstraints c = new GridBagConstraints();

    JButton btn1 = new JButton("Button 1");
    JButton btn2 = new JButton("Button 2");
    JButton btn3 = new JButton("Button 3");
    JButton btn4 = new JButton("Button 4");
    c.fill = GridBagConstraints.BOTH;
    c.weightx = 1.0;
    JButton btn5 = new JButton("Button 5");
    layout.setConstraints(btn5, c);

    add(btn1);
    add(btn2);
    add(btn3);
    add(btn4);
    add(btn5);

  }
}

