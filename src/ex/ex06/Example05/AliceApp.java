package ex.ex06.Example05;
class King{
    public void questioning(){
        System.out.println("왕은 심문한다.");
    }
}
class Queen{
    public void questioning(){
        System.out.println("왕비는 심문한다.");
    }
}
class hatSeller{
    public void answer(){
        System.out.println("모자장수는 대답한다.");
    }
}
class rabbit{
    public void answer(){
        System.out.println("토끼는 대답한다.");
    }
}

public class AliceApp {
    public static void main(String[] args) {
        Queen u1 = new Queen();
        rabbit u2 = new rabbit();

    u1.questioning();
    u2.answer();
    }
}
