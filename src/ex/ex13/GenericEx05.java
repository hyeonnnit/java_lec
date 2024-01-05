package ex.ex13;

class Model0<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

class User0 {
    public int id = 1;
    public String name = "홍길동";
    public String email = "ssar@nate.com";

    public void hello() {
        System.out.println("안녕하세요");
    }
}

public class GenericEx05 {
    public static void main(String[] args) {
        Model0<User0> model0 = new Model0();
        model0.setData(new User0());
        User0 user0 = model0.getData();
        user0.hello();
    }
}