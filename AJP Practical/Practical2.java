import java.awt.*;
class Practical2 extends Frame 
{
  public Practical2()
   {
	 
	 setLayout(null);
     Label sub = new Label("Choose Subjects:");
     sub.setBounds(50, 50, 120, 30); 
     add(sub);
     List ls = new List(5, true);
     ls.setBounds(180, 50, 150, 120); 
      ls.add("AJP");
     ls.add("CSS");
     ls.add("STE");
     ls.add("OSY");
     ls.add("EVS");
     add(ls);
     Label sem = new Label("Select Semester:");
     sem.setBounds(50, 200, 120, 30); 
     add(sem);
     Choice ch = new Choice();
     ch.setBounds(180, 200, 150, 30); 
     ch.add("Semister 1");
     ch.add("Semister 2");
     ch.add("Semister 3");
     ch.add("Semister 4");
     ch.add("Smeister 5");
     add(ch);
 }

  public static void main(String args[]) 
  {
   Practical2 p2 = new Practical2();
   p2.setSize(600, 600);
   p2.setTitle("Pr2 By Ashay ");
   p2.setVisible(true);
  }
}