import java.awt.event.*;
import javax.swing.*;

public class MenuDialogDemo {

    public static void main(String[] args) {

        JFrame f = new JFrame("Menu & Dialog Demo");
        f.setSize(400, 300);

        // Menu Bar
        JMenuBar mb = new JMenuBar();

        // Menu
        JMenu file = new JMenu("File");

        // Menu Items
        JMenuItem open = new JMenuItem("Open");
        JMenuItem exit = new JMenuItem("Exit");

        // Add menu items to menu
        file.add(open);
        file.add(exit);

        // Add menu to menu bar
        mb.add(file);

        // Set menu bar to frame
        f.setJMenuBar(mb);

        // Action for Open (Dialog Box)
        open.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Open clicked!");
            }
        });

        // Action for Exit
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int choice = JOptionPane.showConfirmDialog(f, "Do you want to exit?");
                if (choice == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
         f.setVisible(true);
         
       
    }
}