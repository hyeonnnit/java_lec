package bookEx.bookEx04;
class A{
    private int a;
    int b;
    public int c;
}
public class Test {
    public static void main(String[] args) {
        A obj = new A();

        obj.b = 20;
        obj.c = 30;
        System.out.println(obj.b);
        System.out.println(obj.c);
    }
}
