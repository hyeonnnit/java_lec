package ex.ex02;

import java.util.Scanner;

public class ProgEx06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("드라이브 이름: ");
        String driveName = sc.nextLine();

        System.out.print("디렉터리 이름: ");
        String directory = sc.nextLine();

        System.out.print("파일 이름: ");
        String fileName = sc.nextLine();

        System.out.print("확장자: ");
        String user = sc.nextLine();

        System.out.println( driveName + ":" + directory + fileName + "." + user);
    }
}
