import java.awt.event.*;
import javax.swing.*;

public class EventDemo {
    public static void main(String[] args) {

        JFrame f = new JFrame("Event Handling Demo");
        f.setSize(400, 300);
        f.setLayout(null);

        // Button (Action Event)
        JButton b = new JButton("Click Me");
        b.setBounds(50, 50, 120, 30);

        // TextField (Key Event)
        JTextField tf = new JTextField();
        tf.setBounds(50, 100, 150, 30);

        // Label
        JLabel lb = new JLabel("Result:");
        lb.setBounds(50, 150, 200, 30);

        // Add components
        f.add(b);
        f.add(tf);
        f.add(lb);

        // 🔹 Action Event (Button Click)
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lb.setText("Button Clicked!");
            }
        });

        // 🔹 Key Event (Typing in TextField)
        tf.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                lb.setText("Typing: " + tf.getText());
            }
        });

        // 🔹 Mouse Event (Click anywhere)
        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                lb.setText("Mouse Clicked at: " + e.getX() + "," + e.getY());
            }
        });

       
        f.setVisible(true);
    }
}