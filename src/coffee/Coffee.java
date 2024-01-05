package coffee;


public class Coffee {
    private Menu menu;
    private Barista barista;

    public Coffee() {
        this.barista = barista;

    }

    public Coffee(Menu menu) {
        this.menu = menu;
    }

    public boolean SameItem() {
        if (menu.equals(barista.makeCoffee())) {

        }
        return true;
    }
}