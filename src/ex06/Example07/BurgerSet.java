package ex06.Example07;

public class BurgerSet {
    private Burger burger;
    private Coke coke;

    public BurgerSet(Burger burger, Coke coke) {
        this.burger = burger;
        this.coke = coke;
        System.out.println("Burger Set Completion");
    }
    public int getTotalPrice(){
        return burger.getPrice()+coke.getPrice();
    }

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }
}
