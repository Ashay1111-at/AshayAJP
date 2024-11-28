import java.awt.*;
import java.awt.event.*;
public class MouseMotionListenerExample9 extends Frame implements MouseMotionListener
{
MouseMotionListenerExample9()
{
addMouseMotionListener(this);
setSize(300,300);
setLayout(null);
setVisible(true);
}
public void mouseDragged(MouseEvent e)
{
Graphics g=getGraphics();
g.setColor(Color.BLUE);
g.fillOval(e.getX(),e.getY(),20,20);
}
public void mouseMoved(MouseEvent e)
{
}
public static void main(String[] args)
{
new MouseMotionListenerExample9();
}
}