package bookEx.bookEx02;

import java.util.Scanner;

public class Add2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, sum;

        System.out.print("첫 번째 숫자를 입력하시요: ");
        x = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하시요: ");
        y = sc.nextInt();

        sum = x + y;
        System.out.println(sum);

    }
}
