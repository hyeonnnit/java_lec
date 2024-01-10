package ex.ex17.full;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            Socket socket = serverSocket.accept();
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("클라이언트와 연결 완료");

            Thread receiveThread = new Thread(() -> {
                String requestMsg;
                try {
                    while ((requestMsg = br.readLine()) != null) {
                        System.out.println("-클라이언트로부터 받은 메세지: " + requestMsg);
                        if (requestMsg.equalsIgnoreCase("quit")) {
                            System.out.println("연결 종료");
                            break;
                        }
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            Thread sendThread = new Thread(() -> {
                String sendMsg;
                while (true) {
                    System.out.print("클라이언트로 보낼 메세지 입력 후 엔터: ");
                    sendMsg = sc.nextLine();
                    pw.println(sendMsg);
                }
            });
            receiveThread.start();
            sendThread.start();

            receiveThread.join();
            sendThread.join();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
