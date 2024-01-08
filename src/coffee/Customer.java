package coffee;

import java.util.Scanner;

public class Customer {
    private Barista barista;

    public Customer customerCoffee() {
        System.out.print("주문하실 제품을 말씀해주세요: ");
        Scanner sc = new Scanner(System.in);
        String CusItem = sc.nextLine();
        if (CusItem.equals(new Menu())) {
            System.out.println("메뉴가 일치하지 않습니다.");
            System.exit(0);
        }
        return customerCoffee();
    }

    public void Order() {
        Coffee coffee = barista.makeCoffee();
        System.out.println(coffee + "을 받았습니다.");
    }
}