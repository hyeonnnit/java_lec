package ex.ex14.example1;

import java.time.LocalDateTime;

// Data Transfer Object
class JoinDTO {
    private String username; // ssar
    private String password;
    private String email;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public JoinDTO(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
}

class Member {
    private int no;
    private String username;
    private String password;
    private String email;
    private LocalDateTime createdAt;


    public Member(int no, JoinDTO dto) {
        this.no = no;
        this.username = dto.getUsername();
        this.password = dto.getPassword();
        this.email = dto.getEmail();
        this.createdAt = LocalDateTime.now();
    }

    public Member(int no, String username, String password, String email, LocalDateTime createdAt) {
        this.no = no;
        this.username = username;
        this.password = password;
        this.email = email;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Member{" +
                "no=" + no +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}

public class CopyEx05 {
    public static void main(String[] args) {
        JoinDTO d1 = new JoinDTO("ssar", "1234", "ssar@nate.com");
        JoinDTO d2 = new JoinDTO("cos", "1234", "cos@nate.com");
        Member m1 = new Member(1, d1);
        Member m2 = new Member(2, d2);
        System.out.println(m1);
        System.out.println(m2);
    }
}