package ex13;
class Box<D>{
    D data;
}
public class GenericEx01 {
    public static void main(String[] args) {
        Box<String> box1 = new Box();
        Box<Integer> box2 = new Box();
        box1.data = "1";
        box2.data = 1;
    }
}
