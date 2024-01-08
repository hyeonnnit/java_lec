package ex.ex15;

import java.io.IOException;
import java.io.InputStream;

// 보조스트림이 없는 코드
public class StreamEx01 {
    public static void main(String[] args) {
        InputStream input = System.in;
        try {
            int value = input.read();
            System.out.println("받은 값: " + (char) value);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
