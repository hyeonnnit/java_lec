package ex.ex02;

import java.util.Scanner;

public class ProgEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("마일을 입력하시오: ");
        double n1 = sc.nextDouble();

        double mile = n1 * 1.609;
        System.out.print("해당 마일의 킬로미터: " + mile);

    }
}
