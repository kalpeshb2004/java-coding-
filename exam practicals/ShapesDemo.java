import java.awt.*;

public class ShapesDemo extends Frame {

   public ShapesDemo() {
     setSize(400,400);
     setTitle("2D shapes");
     setVisible(true);
   }

   public void paint(Graphics G){
    G.drawRect(200, 200, 200, 200);
    G.drawLine(200, 200, 200, 200);
    G.drawOval(200, 200, 200, 200);
    G.fillOval(200, 200, 200, 200);
    G.fillRect(200, 200, 200, 200);

   }

   public static void main(String[] args) {
       new ShapesDemo();
   }
}