package ex.ex06.Example06;
class Protoss{
}
class Zealot extends Protoss{
    public void attack(){
        System.out.println("질럿이 공격합니다.");
    }
}
class Dragoon extends Protoss{
    public void attack(){
        System.out.println("드라군이 공격합니다.");
    }
}
public class CastingEx01 {
    public static void start(Protoss p){
        if (p instanceof Zealot){
            Zealot u = (Zealot) p;
            u.attack();
        }
        if(p instanceof Dragoon){
            Dragoon u = (Dragoon) p;
            u.attack();
        }
        Zealot u = (Zealot) p;
    }
    public static void main(String[] args) {
        start(new Zealot());
        start(new Dragoon());
    }
}
