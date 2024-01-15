package bookEx.bookEx06;
class Date{
    private int year, month, date;
    public Date(int year, int month, int date){
        this.date = date;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", date=" + date +
                '}';
    }
}
class Employee00 {
    private String name;
    private Date birthDate;


    public Employee00(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Employee00{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
public class EmployeeExTest {
    public static void main(String[] args) {
        Date birth = new Date(1990,1, 1);
        Employee00 emp = new Employee00("홍길동", birth);
        System.out.println(emp);

    }
}
