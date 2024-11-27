import javax.swing.*;
import java.applet.*;
public class practical6 extends JApplet
{
public void init()
{
JComboBox<String> jcb=new JComboBox <>();
jcb.addItem("ENGLISH");
jcb.addItem("MARATHI");
jcb.addItem("HINDI");
jcb.addItem("SANSCRIT");
JScrollPane jspn=new JScrollPane(jcb);
add(jspn);
setSize(200,30);
}
 public static void main(String args[])
 {
 JFrame f=new JFrame("AT pr6");
 practical6 ap=new practical6();
 ap.init();
 f.add(ap);
 f.setSize(300,200);
 f.setVisible(true);
 }
}