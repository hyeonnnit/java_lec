package ex.ex07;

//라이브러리 판매자
interface EventListener{
    void action();
}

//라이브러리 판매자가 생성
class MyApp{
    public void click(EventListener l){
        l.action();
    }
}
//개발자인 내가 구현
//class Button implements EventListener {
//    @Override
//    public void action() {
//        System.out.println("회원가입 로직이 실행됩니다.");
//    }
//}
public class InterEx02 {
    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.click(() -> {System.out.println("회원가입 로직이 실행됩니다.");
        });

    }
}
