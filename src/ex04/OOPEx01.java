package ex04;

//잘못된 예
    class Person3{
        int weight = 100;
    }
public class OOPEx01 {
    public static void main(String[] args) {
        Person3 p3 = new Person3();
        System.out.println(p3.weight);

        p3.weight=60;
        System.out.println(p3.weight);
    }
}
