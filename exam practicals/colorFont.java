import java.awt.*;

public class colorFont extends Frame{

  public colorFont(){
    setTitle("colors and font");
    setSize(400,400);
    setVisible(true);
  }

  public void paint(Graphics g){
    //color
    g.setColor(Color.RED);
    g.drawString("hello" , 50,100);

    //font
    Font f = new Font("Arial" , Font.BOLD,20);
    g.setFont(f);

     //color
    g.setColor(Color.BLUE);
    g.drawString("World" , 50,100);
  }

  public static void main(String[] args) {
      new colorFont();
  }
    
}