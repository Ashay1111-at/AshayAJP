import java.awt.*;  
import javax.swing.*;  

public class practical8 extends JFrame {  
    static JFrame f;       
    static JProgressBar b;

    public static void main(String[] args) {     
        f = new JFrame("Progress Bar");     
        JPanel p = new JPanel();             
        b = new JProgressBar(SwingConstants.HORIZONTAL);     
        b.setValue(0);     
        b.setStringPainted(true);     
        p.add(b);     
        f.add(p);     
        f.setSize(500, 500);  
        f.setVisible(true);
        fill();  
    }  

    public static void fill() {  
        int i = 0;  
        try {  
            while (i <= 100) {     
                b.setValue(i);               
                Thread.sleep(1000);  
                i += 10;  
            }  
        } catch (Exception e) {  
            System.out.println(e);  
        }  
    }  
}  
