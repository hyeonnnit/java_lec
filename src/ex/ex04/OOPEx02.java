package ex.ex04;


    class Person4{
        //상태 = 변수
        private int weight = 100;


        public int getWeight(){
            return weight;

        }

        //행위 = 메서드  exercise=>메서드명
        public int exercise(){
            weight = weight - 10;
            return 0;
        }
    }

public class OOPEx02 {
    public static void main(String[] args) {
        Person4 p4 = new Person4();
        for (int i = 0; i < 10; i++) {
            p4.exercise();
            System.out.println("p4의 몸무게: " + p4.getWeight());
        }

    }
}
