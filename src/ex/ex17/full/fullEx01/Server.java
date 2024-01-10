package ex.ex17.full.fullEx01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(2000);
            Socket socket = serverSocket.accept();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            while (true) {
                String requestMsg = br.readLine();
                System.out.println("클라이언트로부터 받은 메세지: " + requestMsg);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}