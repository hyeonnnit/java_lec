package ex13;
abstract class Animal{
    public abstract void speak();
}
class Dog extends Animal{
    public String name;
    public int age;

    public void speak(){
        System.out.println("BowWow");
    }
}
class Cat extends Animal{
    String name;
    int age;

    public void speak(){
        System.out.println("naaong");
    }
}
public class GenericEx03 {
    public static void main(String[] args) {
       Animal[] arr = new Animal[2];
        arr[0]=new Dog();
        arr[1]=new Cat();
        Animal d1 = (Dog) arr[0];
        Animal c1 = (Cat) arr[1];
        d1.speak();
        c1.speak();
    }
}
