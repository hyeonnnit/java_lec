package bookEx.bookEx06;

public class ShapeExTest04 {
    public static void print(ShapeEx01 s) {
        if (s instanceof Rectangle01) {
            System.out.println("실제 타입은 Rectangle");
        }
        if (s instanceof Triangle01) {
            System.out.println("실제 타입은 Triangle");
        }
        if (s instanceof Circle02) {
            System.out.println("실제 타입은 Circle");
        }
    }
        public static void main (String[]args) {
        Rectangle01 s1 = new Rectangle01();
        Triangle01 s2 = new Triangle01();
        Circle02 s3 = new Circle02();

        print(s1);
        print(s2);
        print(s3);
        }
}