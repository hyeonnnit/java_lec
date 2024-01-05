package bookEx.bookEx02;

import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("섭씨온도를 입력하시오: ");
        double temp = sc.nextDouble();

        double result = (double) 9 / 5 * temp + 32;
        System.out.print("화씨온도는 " + result);
    }

}