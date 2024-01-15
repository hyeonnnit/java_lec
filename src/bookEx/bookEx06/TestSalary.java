package bookEx.bookEx06;
class Employee01{
    public int baseSalary = 3000000;
    int getSalary(){
        return baseSalary;
    }
}
class Manager extends Employee01{
    @Override
    int getSalary(){
        return (baseSalary + 2000000);
    }
}
class Programmer extends Employee01{
    @Override
    int getSalary(){
        return (baseSalary + 3000000);
    }
}
public class TestSalary {
    public static void main(String[] args) {
        Manager salary01 = new Manager();
        System.out.println("관리자의 월급: "+ salary01.getSalary());
        Programmer salary02 = new Programmer();
        System.out.println("프로그래머의 월급: "+ salary02.getSalary());


    }
}
