package ex02;

import java.util.Scanner;

public class ProgEx010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("물체의 무게를 입력: ");
        int kg = sc.nextInt();

        System.out.print("물체의 속도를 입력: ");
        int m = sc.nextInt();

        double energy = 0.5 * kg * m * m;
        System.out.println("물체의 에너지: " +energy);
    }
}
