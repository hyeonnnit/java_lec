package ex04;

public class Circle {
    private int radius;


    //생성자 = 생성될 때 무조건 생성되는 메서드
    //초기화 코드
    public  Circle(int r){
        radius = r;

    }

    public double getArea(){
        return 3.14*radius*radius;

    }
}
