package ex.ex08.example01;

public class StringEx02 {
    public static void main(String[] args) {
        // 문서
        // ? 뒤를 쿼리스트링이라고 한다.
        // 쿼리스트링은 키=값 형태의 데이터의 집합이다.
        // 키=값이 여러개일때는 &로 구분한다.
        // username값과, password값 찾아보기

        String url = "http://www.naver.com?username=ssar&password=1234";
        String query = url.split("\\?")[1];
        String[] params = query.split("&");

        for (String param : params){
            String[] userValue = param.split("=");

            String user = userValue[1];

            System.out.printf("%s : %s, ", userValue[0],user);
        }
    }
}