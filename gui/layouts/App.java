// add package name here if needed
//
import javax.swing.JFrame;

class App {
  public static void main(String[] args) {

    JFrame frame = new JFrame("My Application");

    // BorderLayoutPanel panel = new BorderLayoutPanel();
    // BoxLayoutPanel panel = new BoxLayoutPanel(BoxLayout.LINE_AXIS);
    // CardLayoutPanel panel = new CardLayoutPanel();
    // FlowLayoutPanel panel = new FlowLayoutPanel();
    GridLayoutPanel panel = new GridLayoutPanel();

    frame.add(panel);
    
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}

