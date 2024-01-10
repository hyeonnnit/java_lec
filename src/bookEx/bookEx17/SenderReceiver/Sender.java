package bookEx.bookEx17.SenderReceiver;

import java.io.IOException;
import java.net.DatagramSocket;

public class Sender {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        String s = "Hello";
        byte[] buf = s.getBytes();


    }
}
