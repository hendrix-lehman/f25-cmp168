// add package name here if needed
//
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;

class BorderLayoutPanel extends JPanel {

  public BorderLayoutPanel() {

    BorderLayout layout = new BorderLayout();
    this.setLayout(layout);

    JButton button1 = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");
    JButton button3 = new JButton("Button 3");
    JButton button4 = new JButton("Button 4");
    JButton button5 = new JButton("Button 5");

    add(button1, BorderLayout.NORTH);
    add(button2, BorderLayout.EAST);
    add(button3, BorderLayout.CENTER);
    add(button4, BorderLayout.WEST);
    add(button5, BorderLayout.SOUTH);
  } 

}

