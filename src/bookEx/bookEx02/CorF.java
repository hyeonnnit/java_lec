package bookEx.bookEx02;

import java.util.Scanner;

public class CorF {
    public static void main(String[] args) {
        double cTemp;
        double fTemp;
        int n;
        double temp;

        Scanner sc = new Scanner(System.in);

        System.out.print("화씨온도로 변환 = 1, 섭씨온도로 변환 = 0 중 선택: ");
        n = sc.nextInt();

        System.out.print("온도를 입력하시오: ");
        temp = sc.nextDouble();

        if (n == 1) {
            fTemp = (double) 9 / 5 * temp + 32;
            System.out.print("화씨온도는 " + fTemp);
        } else if (n == 0) {
            cTemp = (double) 5 / 9 * (temp - 32);
            System.out.print("섭씨온도는 " + cTemp);
        }
    }
}