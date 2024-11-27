import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Practical9 extends Applet implements KeyListener {
    String message = "Press any key...";

    public void init() {
        this.addKeyListener(this);
        this.setFocusable(true);
    }

    public void paint(Graphics g) {
        g.drawString(message, 50, 50);
    }

    public void keyPressed(KeyEvent e) {
        message = "Key Pressed: " + e.getKeyChar();
        repaint();
    }

    public void keyReleased(KeyEvent e) {
        message = "Key Released: " + e.getKeyChar();
        repaint();
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyDown(KeyEvent e) {
    }

    public void keyUp(KeyEvent e) {
    }
}
