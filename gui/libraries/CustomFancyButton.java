// add package name here if needed
//
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.BorderFactory;

class CustomFancyButton extends JButton {

    public CustomFancyButton(String text) {
      super(text);
      // Custom styling can be added here
      setFont(getFont().deriveFont(24.0f));
      setStyle();
    }

    private void setStyle() {
        // Example of custom styling
      setBackground(new Color(70, 130, 180)); // Steel Blue
      setForeground(Color.WHITE);
      setFocusPainted(false);
      setBorderPainted(false);
      setBorder(BorderFactory.createLineBorder(Color.RED, 5));
    }

}

