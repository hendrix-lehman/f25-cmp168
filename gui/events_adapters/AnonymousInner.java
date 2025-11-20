import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;

class AnonymousInner extends JPanel {

  public AnonymousInner(int value) {
    this.addMouseListener(new MouseAdapter() {
      private Color color = Color.BLUE;
      private int drawSize = 20;
      private int lastX, lastY = 0;
      // private int lastY = 0;
      private int x, y = 0;

      public void mouseClicked(MouseEvent e) {
        lastX = e.getX();
        lastY = e.getY();

        Graphics g = getGraphics();
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(color);
        g2d.fillOval(lastX - drawSize / 2, lastY - drawSize / 2, drawSize, drawSize);

        System.out.println("AnonymousInner MouseAdapter: mouseClicked");
        System.out.println("Accessing outer class value: " + value);
      }
    });
    System.out.println("AnonymousInner created with value: " + value);
  }
}

