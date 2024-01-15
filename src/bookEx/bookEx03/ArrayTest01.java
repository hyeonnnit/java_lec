package bookEx.bookEx03;

public class ArrayTest01 {
    public static void main(String[] args) {
        int[] s = new int[10];
        for (int i = 0; i < s.length; i++) {
            s[i] = i;
            System.out.print(s[i] + " ");
        }
    }
}
