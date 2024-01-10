package ex;

interface CookAble {
    void cook();
}

interface KnifeAble {
    void kill();
}

class 백종원 implements CookAble {

    @Override
    public void cook() {

    }
}

class 전사 implements KnifeAble, CookAble {

    @Override
    public void kill() {
        System.out.println("공격");
    }

    @Override
    public void cook() {
        System.out.println("요리");
    }
}

public class Hello {
    public static void main(String[] args) {

    }

}