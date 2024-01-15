package ex.ex06.Example07;

public class ShrimpBurger extends Burger {
    private String material;
    public String getMaterial() {
        return material;
    }
    public ShrimpBurger(String name, int price, String material) {
        super(name, price);
        this.material = material;
    }
}