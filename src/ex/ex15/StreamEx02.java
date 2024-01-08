package ex.ex15;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx02 {
    public static void main(String[] args) {
        InputStream in = System.in;
        // ir은 키보드에 연결된 객체
        InputStreamReader ir = new InputStreamReader(System.in);

        // 보조스트림에 연결된 ir이 ch를 불러옴
        char[] ch = new char[4];
        try {
            ir.read(ch);
            for (char c : ch) {
                System.out.print(c + " ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
