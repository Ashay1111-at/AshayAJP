import java.io.*;
import java.net.*;

public class SimpleChatServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server is waiting for clients...");

            //server code
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            String message;
            while ((message = input.readLine()) != null) {
                System.out.println("Client: " + message);
                output.println("Server: " + message); 
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
