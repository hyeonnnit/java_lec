package bookEx.bookEx06;

public class ShapeExTest03 {
    public static void print(ShapeEx01 s){
        System.out.println("x=" + s.x + " y=" + s.y);
    }
    public static void main(String[] args) {
        Rectangle01 s1 = new Rectangle01();
        Triangle01 s2 = new Triangle01();
        Circle02 s3 = new Circle02();

        print(s1);
        print(s2);
        print(s3);
    }
}
