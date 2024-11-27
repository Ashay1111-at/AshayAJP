import javax.swing.*;  
import javax.swing.tree.DefaultMutableTreeNode;  
public class practical7
 {  
    JFrame f;  
    practical7()
	{  
        f=new JFrame();   
        DefaultMutableTreeNode subjects=new DefaultMutableTreeNode("Subjects");  
        DefaultMutableTreeNode AJP=new DefaultMutableTreeNode("AJP");  
        DefaultMutableTreeNode css=new DefaultMutableTreeNode("CSS");  
        subjects.add(AJP);  
        subjects.add(css);  
        DefaultMutableTreeNode ch1=new DefaultMutableTreeNode("Chapter 1");  
        DefaultMutableTreeNode ch2=new DefaultMutableTreeNode("Chapter 2");  
        DefaultMutableTreeNode ch3=new DefaultMutableTreeNode("Chapter 3");  
        DefaultMutableTreeNode ch4=new DefaultMutableTreeNode("Chapter 4");  
        AJP.add(ch1);
		AJP.add(ch2);
		AJP.add(ch3); 
		AJP.add(ch4);      
        JTree jt=new JTree(subjects);  
        f.add(jt);  
        f.setSize(200,200);  
        f.setVisible(true);  
    }  
    public static void main(String[] args) 
	{  
    new practical7();  
    }
}