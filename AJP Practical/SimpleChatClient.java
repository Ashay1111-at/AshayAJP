import java.io.*;
import java.net.*;
import java.util.Scanner;

public class SimpleChatClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345)) {
            
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            Scanner scanner = new Scanner(System.in);
            String message;
            //client code
            
            while (true) {
                System.out.print("You: ");
                message = scanner.nextLine();
                output.println(message); 

                String response = input.readLine(); 
                System.out.println(response); 
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
