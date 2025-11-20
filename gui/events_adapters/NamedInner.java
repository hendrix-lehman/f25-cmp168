import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class NamedInner extends JPanel  {

  int value;

  public NamedInner(int value) {
    InnerMouseAdapter innerMouseAdapter = new InnerMouseAdapter();
    this.addMouseListener(innerMouseAdapter);
    this.value = value;
    System.out.println("NamedInner created with value: " + this.value);
  }

  private class InnerMouseAdapter extends MouseAdapter {
    public void mouseClicked(MouseEvent e) {
      System.out.println("InnerMouseAdapter: mouseClicked");
      System.out.println("Accessing outer class value: " + NamedInner.this.value);
    }
  }

}

