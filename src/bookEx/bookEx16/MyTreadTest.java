package bookEx.bookEx16;
class MyThread extends Thread{
    public void run(){
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(i+" ");
        }
    }
}
public class MyTreadTest {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
    }
}
