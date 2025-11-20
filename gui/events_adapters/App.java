import javax.swing.JFrame;
import javax.swing.JPanel;

class App {

  public static void main(String[] args) {
    JFrame frame = new JFrame("Listener Example");

    // ImplementListenerDirectly panel = new ImplementListenerDirectly();

    // JPanel panel = new JPanel();
    // ExtendAdapter adapter = new ExtendAdapter(42);
    // panel.addMouseListener(adapter);
    // frame.addMouseListener(adapter);

    // NamedInner panel = new NamedInner(42);

    AnonymousInner panel = new AnonymousInner(42);
    
    frame.add(panel);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 200);
    frame.setVisible(true);
    
  }
}

