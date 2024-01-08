package coffee;

public class CoffeeApp {
    public static void main(String[] args) {
        System.out.println("메뉴: 아메리카노, 카푸치노, 마끼아또, 에스프레소");
        Barista barista = new Barista();
        Customer customer = new Customer();
        customer.customerCoffee();
        customer.Order();


    }
}