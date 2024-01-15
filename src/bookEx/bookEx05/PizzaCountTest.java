package bookEx.bookEx05;

public class PizzaCountTest {
    private String toppings;
    static int count = 0;

    public PizzaCountTest(String topping){
        this.toppings = toppings;
        count ++;
    }
}
