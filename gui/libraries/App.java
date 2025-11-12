// add package name here if needed
//
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;

class App {

  public static void main(String[] args) {
    // create a window using javax.swing

    JFrame frame = new JFrame("My First Swing App");

    JPanel panel = new JPanel();
    panel.setBackground(Color.YELLOW);
    panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 15));

    JLabel label = new JLabel("Hello, Swing!", JLabel.CENTER);

    CustomFancyButton button = new CustomFancyButton("Click Me");

    panel.add(label);
    panel.add(button);

    // JPanel panel2 = new JPanel();
    // JLabel label2 = new JLabel("Welcome to Java GUI programming.", JLabel.CENTER);
    // panel2.add(label2);

    // frame.add(panel2);
    frame.add(panel);

    frame.setVisible(true);
    frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}

