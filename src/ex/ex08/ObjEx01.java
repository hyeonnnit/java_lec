package ex.ex08;
class Account {
    String author;
    private int number;
    private int balance;

    public Account(String author, int number, int balance) {
        this.author = author;
        this.number = number;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "author='" + author + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }
}
public class ObjEx01 {
    public static void main(String[] args) {
        Account account1 = new Account("홍길동",1111,1000);
        Account account2 = new Account("홍길",2222,2000);
        System.out.println(account1);
        System.out.println(account1.getClass());
        System.out.println(account2.getClass());
        System.out.println(account1.hashCode());
        System.out.println(account2.hashCode());

        //== -> 주소비교
        if (account1 == account2){
            System.out.println("Is same?");
        }
        //account ->equals() (오브젝트) (주소비교)
        //account.toString -> equals() (주소비교 and 값비교)
        if (account1.toString().equals(account2.toString())){
            System.out.println();
        }
    }
}
