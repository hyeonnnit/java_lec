package bookEx.bookEx04;
class Box01{
    int width, height, depth;
}
public class BoxTest01 {
    public static void main(String[] args) {
        Box01 b = new Box01();
        System.out.printf("상자의 크기: (%d, %d, %d)", b.width, b.height, b.depth);
    }
}
