import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

class ImplementListenerDirectly extends JPanel implements ActionListener, MouseListener {
  
  private JButton button;

  public ImplementListenerDirectly() {
    button = new JButton("Click Me");
    button.addActionListener(this);
    this.add(button);

    // add mouse listener to the panel
    this.addMouseListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("Button clicked!");
  }

  @Override
  public void mouseClicked(MouseEvent e) {
    System.out.println("Mouse clicked at: " + e.getX() + ", " + e.getY());
  }

  @Override
  public void mousePressed(MouseEvent e) {}
  
  @Override
  public void mouseReleased(MouseEvent e) {}

  @Override
  public void mouseEntered(MouseEvent e) {}

  @Override
  public void mouseExited(MouseEvent e) {
    System.out.println("Mouse exited the panel");
  }

}

