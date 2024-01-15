package bookEx.bookEx06;

class ShapeEx01 {
    protected int x,y;
    public void draw(){
        System.out.println("Shape Draw");
    }
}
class Rectangle01 extends ShapeEx01{
    private int width, height;
    public void draw(){
        System.out.println("Rectangle Draw");
    }
}
class Triangle01 extends ShapeEx01{
    private int base, height;
    public void draw(){
        System.out.println("Triangle Draw");
    }
}
class Circle02 extends ShapeEx01 {
    private int radius;
    public void draw(){
        System.out.println("Circle Draw");
    }
}

