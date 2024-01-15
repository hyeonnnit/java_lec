package bookEx.bookEx05;

public class PizzaCount {
    public static void main(String[] args) {
        PizzaCountTest p1 = new PizzaCountTest("Supreme");
        PizzaCountTest p2 = new PizzaCountTest("Cheese");
        PizzaCountTest p3 = new PizzaCountTest("Pepperoni");
        int c = PizzaCountTest.count;
        System.out.println("판매 수 = "+c);
    }
}
