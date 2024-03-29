package ex.ex17.full.fullEx03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try {
            // 1. 소켓과 버퍼 만들기
            ServerSocket serverSocket = new ServerSocket(2000);
            Socket socket = serverSocket.accept();
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            Scanner sc = new Scanner(System.in);
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            // 2. 메세지 받기 스레드, 다른 스택이라 try-catch 가능
            new Thread(() -> {
                while (true) {
                    try {
                        String requestMsg = br.readLine();
                        System.out.println("클라이언트로부터 받은 메세지: " + requestMsg);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
            new Thread(() -> {
                while (true) {
                    String keyboardMsg = sc.nextLine();
                    pw.println(keyboardMsg);
                }
            }).start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}