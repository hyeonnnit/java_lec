package ex.ex08.example02;

class Repository02 {
    void insert(String id, String pw) throws RuntimeException {
        System.out.println("레포지토리 insert 호출됨");
        if (id.length() < 4) {
            throw new RuntimeException("DB: id의 길이가 4자 이상 이어야 합니다.");
        }
        if (pw.length() > 50) {
            throw new RuntimeException("DB: pw의 길이가 50자 이하 이어야 합니다.");
        }
    }
}
class Controller02 {
    void join(String id, String pw) throws RuntimeException{
        System.out.println("컨트롤러 회원가입 호출됨");
        if (id.length() < 4) {
            throw new RuntimeException("Controller : id의 길이가 4자 이상 이어야 합니다.");
        }

        Repository02 repo = new Repository02();
        repo.insert(id, pw);
    }
}

public class TryEx05 {
    public static void main(String[] args) {
        Controller02 con = new Controller02();
        try {
            con.join("ssa", "1234");
            System.out.println("회원가입 성공");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}