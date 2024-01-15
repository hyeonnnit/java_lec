package bookEx.bookEx06;

public class ShapeExTest02 {
    public static void main(String[] args) {
        ShapeEx01[] arrayOfShpaes;
        arrayOfShpaes = new ShapeEx01[3];

        arrayOfShpaes[0] = new Rectangle01();
        arrayOfShpaes[1] = new Triangle01();
        arrayOfShpaes[2] = new Circle02();
        for (int i = 0; i < arrayOfShpaes.length; i++) {
            arrayOfShpaes[i].draw();
        }
    }
}
