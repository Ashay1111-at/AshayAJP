import javax.swing.*;
import java.awt.event.*;

public class Practical12 extends JFrame {
    public Practical12() {
        setTitle("WindowAdapter Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int choice = JOptionPane.showConfirmDialog(
                        Practical12.this,
                        "Are you sure you want to exit?",
                        "Confirm Exit",
                        JOptionPane.YES_NO_OPTION
                );
                if (choice == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }

            @Override
            public void windowOpened(WindowEvent e) {
                JOptionPane.showMessageDialog(
                        Practical12.this,
                        "Welcome to the WindowAdapter Example!",
                        "Welcome",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Practical12 frame = new Practical12();
            frame.setVisible(true);
        });
    }
}
