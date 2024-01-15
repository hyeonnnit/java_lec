package ex.ex03.ProgEx;

public class ProgEx03 {
    public static void main(String[] args) {

        int []s =new int [50];
        for (int i = 1; i < s.length; i++) {
            s[i] = i;
            System.out.print(s[i]);
            System.out.print(" ");
            if (s[i] % 3 == 0){
                System.out.print("짝 ");
            }
        }
    }
}
