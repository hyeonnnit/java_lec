package ex06.Example04;

public class Zealot extends Protoss{
    String name;

    public Zealot(String name){
        this.name = name;
    }

    public void attack(){
        System.out.println("질럿이 공격한다. "+ name);
    }

}
