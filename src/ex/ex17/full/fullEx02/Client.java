package ex.ex17.full.fullEx02;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 2000);
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            Scanner sc = new Scanner(System.in);
            while (true) {
                String keyboardMsg = sc.nextLine();
                pw.println(keyboardMsg);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}