// add package name here if needed
//
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;

class CardLayoutPanel extends JPanel {
  private CardLayout layout;

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

  public CardLayoutPanel() {
    layout = new CardLayout();
    setLayout(layout);

    JButton btn1 = new JButton("Button 1");
    btn1.addActionListener(new ButtonClickListener(this));
    btn1.setFont(btn1.getFont().deriveFont(24.0f));
    JButton btn2 = new JButton("Button 2");
    btn2.addActionListener(new ButtonClickListener(this));
    btn2.setFont(btn2.getFont().deriveFont(24.0f));
    JButton btn3 = new JButton("Button 3");
    btn3.addActionListener(new ButtonClickListener(this));
    btn3.setFont(btn3.getFont().deriveFont(24.0f));
    JButton btn4 = new JButton("Button 4");
    btn4.addActionListener(new ButtonClickListener(this));
    btn4.setFont(btn4.getFont().deriveFont(24.0f));
    JButton btn5 = new JButton("Button 5");
    btn5.addActionListener(new ButtonClickListener(this));
    btn5.setFont(btn5.getFont().deriveFont(24.0f));

    add(btn1);
    add(btn2);
    add(btn3);
    add(btn4);
    add(btn5);

  }

  public CardLayout getLayout() {
    return layout;
  }

}

