package coffee;

import java.util.Scanner;

public class Customer {
    public void Customer() {
        System.out.print("주문하실 제품을 말씀해주세요: ");
        Scanner sc = new Scanner(System.in);
        String CusItem = sc.nextLine();
    }

    private Barista barista;

    public Customer(Barista barista) {
        this.barista = barista;
    }


    public void order(String menuName) {
        Coffee coffee = barista.makeCoffee();
        System.out.println("을 받았습니다.");
    }
}