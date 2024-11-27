import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Practical11 extends JFrame implements ActionListener
{
private JTextField textField;
private JPasswordField passwordField;
private JButton submitButton;
public Practical11()
{
setTitle("Practical 10 Ashay");
setSize(300, 150);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new FlowLayout());
textField = new JTextField(15);
passwordField = new JPasswordField(15);
submitButton = new JButton("Submit");
add(new JLabel("Username:"));
add(textField);
add(new JLabel("Password:"));
add(passwordField);
add(submitButton);
submitButton.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
String username = textField.getText();
String password = new String(passwordField.getPassword());
System.out.println("Username: " + username);
System.out.println("Password: " + password);
}
public static void main(String[] args)
{
Practical11 example = new Practical11();
example.setVisible(true);
}
}