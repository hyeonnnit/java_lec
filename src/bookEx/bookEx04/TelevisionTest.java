package bookEx.bookEx04;

class Television {
    private int channel;
    private int volume;
    private boolean onOff;

    Television(int c, int v, boolean o){
        channel = c;
        volume = v;
        onOff = o;
    }
    void print(){
        System.out.printf("채널은 %d이고 볼륨은 %d입니다.\n", channel, volume);
    }
}
public class TelevisionTest {
    public static void main(String[] args) {
        Television myTv = new Television(7, 10, true);
        myTv.print();

        Television yourTv = new Television(11, 20, true);
        yourTv.print();
    }
}
