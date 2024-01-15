package ex02;

import java.util.Scanner;

public class ProgEx01 {
    public static void main(String[] args) {
        System.out.println("10개씩 담을 수 있는 상자");
        System.out.print("넣을 갯수: ");
        int n1 = 127;

        int n2 = n1 / 10;
        int n3 = n1 % 10;

        System.out.print("필요한 박스는 " +n2);
        System.out.print("남는 갯수는 " +n3 );
    }
}
