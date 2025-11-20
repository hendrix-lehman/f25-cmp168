import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class ExtendAdapter extends MouseAdapter {

  int value;

  public ExtendAdapter(int dummy) {
    super();
    this.value = dummy;
    System.out.println("ExtendAdapter constructor called");
    System.out.println("Dummy value: " + dummy);
  }

  @Override
  public void mouseClicked(MouseEvent e) {
    System.out.println("ExtendAdapter mouseClicked called");
    System.out.println("Stored value: " + value);
    System.out.println("Mouse clicked at: " + e.getPoint());
  }
}

