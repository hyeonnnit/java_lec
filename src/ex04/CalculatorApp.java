package ex04;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int result = cal.add(50, 80);
        int result1 = cal.minus(50, 80);
        int result2 = cal.multi(50, 80);
        double result3 = cal.divide(50, 80);
        System.out.println("add: " + result);
        System.out.println("minus: " + result1);
        System.out.println("multi: " + result2);
        System.out.println("divide: " + result3);
    }
}
