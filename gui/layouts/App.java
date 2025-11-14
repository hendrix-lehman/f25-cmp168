// add package name here if needed
//
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;

class App {

  private static class ButtonClickListener implements ActionListener {
    Container parent;

    public ButtonClickListener(Container parent) {
      this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      System.out.println(e.getActionCommand() + " clicked");
      CardLayoutPanel clp = (CardLayoutPanel) parent;
      clp.getLayout().next(parent);
    }
  }

  public static void main(String[] args) {

    JFrame frame = new JFrame("My Application");

    // BorderLayoutPanel panel = new BorderLayoutPanel();
    // BoxLayoutPanel panel = new BoxLayoutPanel(BoxLayout.LINE_AXIS);
    CardLayoutPanel panel = new CardLayoutPanel();

    JButton btn1 = new JButton("Button 1");
    btn1.addActionListener(new ButtonClickListener(panel));
    btn1.setFont(btn1.getFont().deriveFont(24.0f));
    JButton btn2 = new JButton("Button 2");
    btn2.addActionListener(new ButtonClickListener(panel));
    btn2.setFont(btn2.getFont().deriveFont(24.0f));
    JButton btn3 = new JButton("Button 3");
    btn3.addActionListener(new ButtonClickListener(panel));
    btn3.setFont(btn3.getFont().deriveFont(24.0f));
    JButton btn4 = new JButton("Button 4");
    btn4.addActionListener(new ButtonClickListener(panel));
    btn4.setFont(btn4.getFont().deriveFont(24.0f));
    JButton btn5 = new JButton("Button 5");
    btn5.addActionListener(new ButtonClickListener(panel));
    btn5.setFont(btn5.getFont().deriveFont(24.0f));

    panel.add(btn1);
    panel.add(btn2);
    panel.add(btn3);
    panel.add(btn4);
    panel.add(btn5);

    frame.add(panel);
    
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}

