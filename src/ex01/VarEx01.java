package ex01;

public class VarEx01 {

    // 모든 코드는 main 메서드 내부에 적는다.
    public static void main(String[] args) {

        int n1 = 1; // int -> 21억까지 저장 가능 (4Byte)
        double d1 = 1.5; // double -> 21억까지 저장 가능, 소수점 포함 (8Byte)
        long big1 = 20L; // long -> 경까지 저장 가능, 대문자 L 넣어주는게 문법 (8Byte)
        boolean b1 = true; // true 혹은 false로 저장
        char c1 = '가'; // 한글 한글자, 영어 한글자 저장
        
        System.out.println(n1); //out => output, 모니터에 n1을 출력
        System.out.println(d1);
        System.out.println(big1);
        System.out.println(b1);
        System.out.println(c1);
    } // 자바 프로그램 종료 (자바 프로그램의 생명주기 -> main 부터 끝까지)
}
