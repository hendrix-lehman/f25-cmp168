import javax.swing.JPanel;
import java.awt.ComponentOrientation;
import javax.swing.JButton;

class FlowLayoutPanel extends JPanel {

  // JPanel uses FlowLayout by default, so no need to set it explicitly
  public FlowLayoutPanel() {

    // FlowLayout is the default layout manager for JPanel
    // no need to set it explicitly
    // setLayout(new FlowLayout());
    applyComponentOrientation(
      ComponentOrientation.LEFT_TO_RIGHT
    );

    JButton btn1 = new JButton("Button 1");
    JButton btn2 = new JButton("Button 2");
    JButton btn3 = new JButton("Button 3");
    JButton btn4 = new JButton("Button 4");
    JButton btn5 = new JButton("Button 5");

    add(btn1);
    add(btn2);
    add(btn3);
    add(btn4);
    add(btn5);

  }
}

