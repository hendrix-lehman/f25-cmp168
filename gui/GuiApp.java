import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.BorderFactory;
import java.awt.Font;

class GuiApp extends JFrame {

  public GuiApp() {
    setTitle("My Application");

    CustomPanel panel = new CustomPanel();
    add(panel);

    // JPanel panel = new JPanel();

    // JSpinner spinner = new JSpinner();
    // JLabel label = new JLabel("Select a number:");
    // JTextField textField = new JTextField(10);
    // JButton button = new JButton("Submit");

    // label.setFont(new Font("Arial", Font.BOLD, 24));
    // textField.setFont(new Font("Arial", Font.PLAIN, 18));
    // button.setFont(new Font("Arial", Font.PLAIN, 28));

    // panel.add(button);
    // panel.add(spinner);
    // panel.add(label);
    // panel.add(textField);

    // panel.setBackground(Color.MAGENTA);
    // panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 20));
    // add(panel);

    setSize(400, 300);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

}

