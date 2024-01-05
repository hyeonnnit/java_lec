package coffee;

import java.util.List;

public class Menu {
    private List<String> item;

    // 아메리카노, 카푸치노, 마끼아또, 에스프레소
    public Menu(List<String> item) {
        this.item = item;
        item.add("아메리카노");
        item.add("카푸치노");
        item.add("마끼아또");
        item.add("에스프레소");
    }

    @Override
    public String toString() {
        return "Menu{" +
                "Menu=" + item +
                '}';
    }
}