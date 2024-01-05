package bookEx.bookEx02;

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("화씨온도를 입력하시오: ");
        double temp = sc.nextDouble();

        double result = (double) 5 / 9 * (temp - 32);
        System.out.println("섭씨온도는 " + result);

    }
}