package ex.ex06.Example07;

public class Coke {
    private String name;
    private int price;

    public Coke(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println(name + " here");
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}