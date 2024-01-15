package ex.ex02;

import java.util.Scanner;

public class ProgEx07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("받은 돈: ");
        int money = sc.nextInt();

        System.out.print("상품가격: ");
        int price = sc.nextInt();

        int change = money - price;
        int vat = price * 1/10;
        System.out.print("잔돈: " +change);
        System.out.println(" ");
        System.out.println("부가세: " +vat);
    }
}
