package bookEx.bookEx06;
class Shape{
    public void draw(){
        System.out.println("Shape");
    }
}
class Circle extends Shape{
    public void draw(){
        System.out.println("Circle을 그립니다.");
    }
}
class Rectangle extends Shape{
    public void draw(){
        System.out.println("Rectangle을 그립니다.");
    }
}
class Triangle extends Shape{
    public void draw(){
        System.out.println("Triangle을 그립니다.");
    }
}
public class ShapeTest01 {
    public static void main(String[] args) {
        Rectangle s = new Rectangle();
        s.draw();
        Triangle t = new Triangle();
        t.draw();
    }
}
