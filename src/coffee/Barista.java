package coffee;


public class Barista {

    public Coffee makeCoffee() {
        return new Coffee();
    }

    public void Barista() {
        Customer customer = new Customer();
        customer.customerCoffee();
    }
}