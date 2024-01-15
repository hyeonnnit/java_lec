package bookEx.bookEx03;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        long fact = 1;

        System.out.print("정수 입력: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            fact = fact * i;
            System.out.printf("%d!은 %d입니다.\n", n, fact);
        }
    }
}
