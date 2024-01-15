package bookEx.bookEx06;
class Base01 {
    public Base01(){
        System.out.println("Base01 생성자()");
    }
}
class Derived01 extends Base {
    public Derived01(){
        super();
        System.out.println("Derived01 생성자()");
    }
}
public class TestSuper {
    public static void main(String[] args) {
        new Derived01();

    }
}
