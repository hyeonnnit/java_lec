package ex.ex17.full;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        try {
            Socket clientSocket = new Socket("localhost", 5000);
            BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true);

            Thread sendThread = new Thread(() -> {
                String responseMsg;
                while (true) {
                    System.out.print("서버로 보낼 메세지 입력 후 엔터: ");
                    responseMsg = sc.nextLine();
                    pw.println(responseMsg);
                    if (responseMsg.equalsIgnoreCase("quit")) {
                        break;
                    }
                }
            });

            Thread receiveThread = new Thread(() -> {
                String receiveMsg;
                try {
                    while ((receiveMsg = br.readLine()) != null) {
                        System.out.println("-서버로부터 온 메세지: " + receiveMsg);
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            sendThread.start();
            receiveThread.start();

            sendThread.join();
            receiveThread.join();

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
