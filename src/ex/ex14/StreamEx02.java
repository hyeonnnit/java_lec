package ex.ex14;

import java.util.Arrays;
import java.util.List;

class User {
    private String name;
    private int age;

    public void changeAge() {
        this.age = this.age - 1;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class StreamEx02 {
    public static void main(String[] args) {
        // User 3명 만들기
        User u1 = new User("홍길동", 20);
        User u2 = new User("장보고", 15);
        User u3 = new User("임꺽정", 30);
        List<User> arr = Arrays.asList(u1, u2, u3);

        List<User> newArr = arr.stream().map(u -> {
            u.changeAge();
            return u;
        }).toList();
        newArr.stream().forEach(user -> {
            System.out.println(user.getAge());
        });
    }
}
