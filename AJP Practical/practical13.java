import java.net.InetAddress;
import java.net.UnknownHostException;
public class Practical13 
{
 public static void main(String[] args)
{
 try
{
 InetAddress localHost = InetAddress.getLocalHost();
 System.out.println("Local Host Address: " + localHost);
 InetAddress google = InetAddress.getByName("www.google.com");
 System.out.println("Google Address: " + google);
 InetAddress ipAddress = InetAddress.getByName("142.250.190.78");
 System.out.println("InetAddress for 142.250.190.78: " + ipAddress);

 InetAddress[] allGoogleAddresses = InetAddress.getAllByName("www.google.com");
 System.out.println("All IP Addresses for Google:");
 for (InetAddress address : allGoogleAddresses)
{
 System.out.println(address);
 }
 }
catch (UnknownHostException e)
{
 System.out.println("Could not resolve the host");
 e.printStackTrace();
 }
 }
}