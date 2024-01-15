package ex16;
class MyFile{

    // 하드디스크 기록(I/O)
    public void write(){
        try{
            Thread.sleep(5000);
            System.out.println("파일 쓰기 완료");
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
class painter{
    public void painting(){
        System.out.println("그림 그리기 완료");
    }
}
public class TreadEx02 {
    public static void main(String[] args) {
    new Thread(() -> {
        MyFile mf = new MyFile();

        mf.write();
    }).start();
    painter p = new painter();
    p.painting();
    }
}
