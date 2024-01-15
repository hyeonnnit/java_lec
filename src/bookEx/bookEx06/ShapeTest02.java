package bookEx.bookEx06;
class Shape01{
    public void draw(){
        System.out.println("Shape 중의 하나를 그릴 예정");
    }
}
class Circle01 extends Shape01{
    @Override
    public void draw(){
        super.draw();
        System.out.println("Circle을 그립니다.");
    }
}
public class ShapeTest02 {
    public static void main(String[] args) {
        Circle s = new Circle();
        s.draw();
    }
}
