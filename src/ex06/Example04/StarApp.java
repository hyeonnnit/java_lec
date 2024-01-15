package ex06.Example04;

public class StarApp {
    public static void gameStart(Protoss u1, Protoss u2){
        u1.attack();
        u2.attack();
        System.out.println();
    }

    public static void main(String[] args) {
        Protoss z1 = new Zealot("z1"); // [Zealot, Protoss]
        Protoss d1 = new Dragoon("d1"); // [Dragoon, Protoss]
        Protoss r1 = new River("r1"); // [River, Protoss]
        Protoss dark1 = new Dark("d1"); // [Dark, Protoss]
        gameStart(z1,d1);
        gameStart(dark1, dark1);
    }
}
