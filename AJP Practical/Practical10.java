import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Practical10 extends JFrame implements MouseListener {
    String message = "See your event here";

    public Practical10() {
        setTitle("Mouse Event Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(message, 150, 150);
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        message = "Mouse Entered";
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent me) {
        message = "Mouse Exited";
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        message = "Mouse Clicked";
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent me) {
        message = "Mouse Pressed";
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        message = "Mouse Released";
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Practical10 frame = new Practical10();
            frame.setVisible(true);
        });
    }
}
