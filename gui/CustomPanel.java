import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

class CustomPanel extends JPanel {

  public CustomPanel() {
    // Custom initialization code can go here

    JSpinner spinner = new JSpinner();
    JLabel label = new JLabel("Select a number:");
    JTextField textField = new JTextField(10);
    JButton button = new JButton("Submit");

    label.setFont(new Font("Arial", Font.BOLD, 24));
    textField.setFont(new Font("Arial", Font.PLAIN, 18));
    button.setFont(new Font("Arial", Font.PLAIN, 28));

    add(button);
    add(spinner);
    add(label);
    add(textField);

    setBackground(Color.MAGENTA);
    setBorder(BorderFactory.createLineBorder(Color.BLACK, 20));
  }
}

