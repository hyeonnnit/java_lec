package ex06.Example07;

public class Burger {
    private String name;
    private int price;

    public Burger(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println(name+" is made");
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
}
