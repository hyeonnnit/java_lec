package bookEx.bookEx04;

public class Television01 {
    int channel;
    int volume;
    boolean onOff;

    public static void main(String[] args) {
    Television01 myTv = new Television01();
    myTv.channel = 7;
    myTv.volume = 10;
    myTv.onOff = true;

    Television01 yourTv = new Television01();
    yourTv.channel = 9;
    yourTv.volume = 12;
    yourTv.onOff = true;
        System.out.printf("나의 텔레비전의 채널은 %d이고 볼륨은 %d입니다.", myTv.channel, myTv.volume);
        System.out.printf("너의 텔레비전의 채널은 %d이고 볼륨은 %d입니다.", yourTv.channel, yourTv.volume);
    }
}
