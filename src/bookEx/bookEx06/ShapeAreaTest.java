package bookEx.bookEx06;

class Shape00{
    public double getArea(){
        return 0;
    }
    public Shape00(){
        super ();
    }
}
class Rectangle00 extends Shape00{
    private double width, height;
    public double getArea(){
        return width*height;
    }
    public Rectangle00(double width, double height){
        super();
        this.width = width;
        this.height = height;
    }
}
class Triangle00 extends Shape00{
    private double base, height;
    public double getArea(){
        return 0.5*base*height;
    }
    public Triangle00(double base, double height){
        super();
        this.height = height;
        this.base = base;

    }
}
public class ShapeAreaTest {
    public static void main(String[] args) {
        Shape00 r = new Rectangle00(10.0, 20.0);
        Shape00 t = new Triangle00(10.0, 20.0);
        System.out.println("Rectangle: " + r.getArea());
        System.out.println("Triangle: " + t.getArea());

    }
}
