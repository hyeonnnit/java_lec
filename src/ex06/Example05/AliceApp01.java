package ex06.Example05;

abstract class Judge{
    public abstract void questioning();
}
abstract class Witness{
    public abstract void answer();
}
class King01 extends Judge{
    public void questioning(){
        System.out.println("왕은 심문한다.");
    }
}
class Queen01 extends Judge{
    public void questioning(){
        System.out.println("왕비는 심문한다.");
    }
}
class hatSeller01 extends Witness{
    public void answer(){
        System.out.println("모자장수는 대답한다.");
    }
}
class rabbit01 extends Witness{
    public void answer(){
        System.out.println("토끼는 대답한다.");
    }
}
class Alice extends Witness{
    public void answer(){
        System.out.println("엘리스는 대답한다.");
    }
 }
public class AliceApp01 {
    public static void main(String[] args) {
        Judge u1 = new Queen01();
        Witness u2 = new rabbit01();

        u1.questioning();
        u2.answer();
    }
}
