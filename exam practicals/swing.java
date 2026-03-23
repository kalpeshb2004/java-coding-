import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; // ✅ missing import
import javax.swing.*;

public class swing {
    public static void main(String[] args) {

        // Frame
        JFrame j = new JFrame("Simple Calculator");
        j.setSize(400, 400);
        j.setLayout(null);

        // TextFields
        JTextField tf1 = new JTextField();
        tf1.setBounds(50, 50, 120, 30);

        JTextField tf2 = new JTextField();
        tf2.setBounds(200, 50, 120, 30);

        // Buttons
        JButton b1 = new JButton("+");
        b1.setBounds(50, 120, 50, 30);

        JButton b2 = new JButton("-");
        b2.setBounds(120, 120, 50, 30);

        JButton b3 = new JButton("*");
        b3.setBounds(190, 120, 50, 30);

        JButton b4 = new JButton("/");
        b4.setBounds(260, 120, 50, 30);

        // Label
        JLabel lb = new JLabel("Result:");
        lb.setBounds(50, 180, 200, 30);

        // Add components
        j.add(tf1);
        j.add(tf2);
        j.add(b1);
        j.add(b2);
        j.add(b3);
        j.add(b4);
        j.add(lb);

        // Operation (+)
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(tf1.getText());
                int b = Integer.parseInt(tf2.getText());
                lb.setText("Result: " + (a + b));
            }
        });

        
        j.setVisible(true);
    }
}