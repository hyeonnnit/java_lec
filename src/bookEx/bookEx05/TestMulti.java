package bookEx.bookEx05;

public class TestMulti {
    public static int cube(int x){
        int result = x*x*x;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("10*10*10= " + cube(10));
    }
}
