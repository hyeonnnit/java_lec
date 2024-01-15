package ex06.Example07;

public class LotteApp {
    public static void main(String[] args) {
        Burger b1 = new Burger("Basic Burger",1000);
        Burger b2 = new ShrimpBurger("Shrimp Burger",2000,"Shrimp");
        Coke c1 = new Coke("Coke",500);
        System.out.println("");
        BurgerSet set1 = new BurgerSet(
                new Burger("Basic Burger",1000),
                new Coke("Coke",500));
        System.out.println("Total Price is " + set1.getTotalPrice());

    }
}
