package ex02;

import java.util.Scanner;

public class ProgEx08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("구의 반지름: ");
        double r = sc.nextDouble();

        double v = 4.0 / 3.0 * r * r * r;
        System.out.println("구의 부피는: " + v);

    }
}
