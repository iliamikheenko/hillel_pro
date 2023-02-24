package main.java.socket;

import main.java.answer.AnswerLocalTime;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.regex.Pattern;


public class SocketServerRunner {
    public static void main(String[] args) {
        try (var serverSocket = new ServerSocket(8081);
             var socket = serverSocket.accept();
             var response = new DataOutputStream(socket.getOutputStream());
             var request = new DataInputStream(socket.getInputStream())) {
            if (!Pattern.matches(".*[ёъыэЁЪЫЭ].*",request.readUTF())){
                new AnswerLocalTime(response).answer();
            } else {
                response.writeUTF("Що таке паляниця?");
                if ("хлiб".equals(request.readUTF())){
                    new AnswerLocalTime(response).answer();
                } else {
                    socket.close();
                }
            }
        } catch (IOException e) {
            System.out.println("Сталася якась помилка: " + e.getMessage());
        }
    }
}
