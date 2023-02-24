package main.java.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SocketRunner {
    public static void main(String[] args) {
        try (var socket = new Socket("localhost", 8081);
             var request = new DataOutputStream(socket.getOutputStream());
             var response = new DataInputStream(socket.getInputStream());
             var scanner = new Scanner(System.in)){
             while (scanner.hasNextLine()){
                var massage = scanner.nextLine();
                request.writeUTF(massage);
                System.out.println("Відповідь з сервера: " + response.readUTF());
            }
        } catch (IOException e){
            System.out.println("Сервер вже вiдключено");
        }
    }
}
