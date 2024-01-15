package bookEx.bookEx16;
class MyRunnable0 implements Runnable{
    String myName;
    public MyRunnable0(String name){
        myName = name;
    }
    public void run(){
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(myName + i + " ");
        }
    }
}
public class TestThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable0("A"));
        Thread t2 = new Thread(new MyRunnable0("B"));
        t1.start();
        t2.start();
    }
}
